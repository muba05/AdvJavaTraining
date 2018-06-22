package com.maveric.service;

import java.util.List;

import com.maveric.dao.FlightDAO;
import com.maveric.model.FlightBookingModel;

public class FlightBean {
	
	public boolean flightBooking(FlightBookingModel flightDetails){
		System.out.println("*************************");
		System.out.println("Flight Booking Details: ");
		System.out.println("*************************");
		System.out.println(flightDetails.getFlightName());
		System.out.println(flightDetails.getSource());
		System.out.println(flightDetails.getDestination());
		System.out.println(flightDetails.getFare());
		System.out.println(flightDetails.getNoOfSeats());
		System.out.println(flightDetails.getAircraftName());
		System.out.println("*************************");
		
		if(flightDetails.getAircraftName() != null &&
				flightDetails.getAircraftName().equalsIgnoreCase("boeing")){
			System.out.println("Added in DB");
			FlightDAO flightDAO = new FlightDAO();
			flightDAO.flightToDB(flightDetails);
			System.out.println("Added in DB2");
			return true;
		}else{
			System.out.println("Not Added in DB");
			return false;
		}
	}
	
	public List<FlightBookingModel> flightBookingList(){
		System.out.println("*************************");
		System.out.println("Flight Booking Details List");
		System.out.println("*************************");
		
			FlightDAO flightDAO = new FlightDAO();
			return flightDAO.flightList();
	}

}
