package org.example.parkinglot.ejb;
import jakarta.ejb.EJBException;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.example.parkinglot.common.CarDto;
import org.example.parkinglot.entities.Car;
import org.example.parkinglot.entities.User;
import org.example.parkinglot.servlets.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Stateless
public class CarsBean {

    private static final Logger LOG = Logger.getLogger(CarsBean.class.getName());

    @PersistenceContext
    EntityManager entityManager;

    List<CarDto> copyCarsToDto(List<Car> cars) {
        CarDto temp;
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars) {
            Long ID= car.getId();


             String LicensePlate=car.getLicensePlate();

            String ParkingSpot= car.getParkingSpot();

           String owner= car.getOwner().getUsername();
           carDtos.add(new CarDto(ID,LicensePlate,ParkingSpot,owner));
        }
        return carDtos;
    }

    public List<CarDto> findAllCars() {
        LOG.info("findAllCars");
        try{
          TypedQuery<Car> typedQuery=entityManager.createQuery("SELECT c FROM Car c", Car.class);
          List<Car> cars=typedQuery.getResultList();
          return copyCarsToDto(cars);
        }catch(Exception ex)
        {
            throw new EJBException(ex);
        }
    }

}
