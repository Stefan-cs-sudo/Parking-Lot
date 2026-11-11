package org.example.parkinglot.common;

public class CarDto {
    Long id;
    String LicensePlate;
    String parkingSpot;
    String ownerName;

    public CarDto(Long id, String LicensePlate,String parkingSpot,String ownerName) {

        this.id = id;
        this.LicensePlate = LicensePlate;
        this.parkingSpot = parkingSpot;
        this.ownerName = ownerName;

    }

    public Long getId()
    {
        return id;
    }
    public String getLicensePlate()
    {
        return LicensePlate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
