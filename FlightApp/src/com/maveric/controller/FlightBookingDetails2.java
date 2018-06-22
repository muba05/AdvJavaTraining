package com.maveric.controller;

import java.io.IOException;
import java.util.List;

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
public class FlightBookingDetails2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightBookingDetails2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FlightBean flightBean = new FlightBean();
		List<FlightBookingModel> flightBookingModels = flightBean.flightBookingList();
		request.setAttribute("flightList", flightBookingModels);
		request.getRequestDispatcher("FlightBookingResult.jsp").forward(request, response);	
	}

}
