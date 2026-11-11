

package org.example.parkinglot.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// Import your entity and EJBs/Services here

import java.io.IOException;
import java.util.ArrayList; // Used temporarily for dummy data

@WebServlet(name = "CarsServlet", value = "/cars")
class CarsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO: In the future, fetch this from a Database using an EJB (e.g., carBean.findAllCars())
        // For now, let's pass a dummy variable so the JSP doesn't crash
        request.setAttribute("cars", new ArrayList<>());
        request.setAttribute("numberOfFreeParkingSpots", 15);

        // Forward the request and data to the JSP
        request.getRequestDispatcher("/WEB-INF/pages/cars.jsp").forward(request, response);
    }
}