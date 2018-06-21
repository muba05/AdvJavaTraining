package com.maveric.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maveric.model.FlightBookingModel;
import com.maveric.service.FlightBean;

/**
 * Servlet implementation class UserBookingDetails
 */
//@WebServlet("/UserBookingDetails")
public class FlightBookingDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightBookingDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FlightBookingModel flightDetails = new FlightBookingModel();
		flightDetails.setFlightName(request.getParameter("flightName"));
		flightDetails.setDestination(request.getParameter("flightDestination"));
		flightDetails.setFare(Double.valueOf(request.getParameter("flightFare")));
		flightDetails.setNoOfSeats(Integer.valueOf(request.getParameter("flightSeat")));
		flightDetails.setSource(request.getParameter("flightSource"));
		flightDetails.setAircraftName(request.getParameter("flightAir"));
		
		FlightBean flightBean = new FlightBean();
		boolean addedDB = flightBean.flightBooking(flightDetails);
		if(!addedDB){
			response.sendRedirect("https://www.google.com");
		}else{
			request.setAttribute("flight", flightDetails);
			request.getRequestDispatcher("FlightBookingResult.jsp").forward(request, response);
		}
			
	}

}
