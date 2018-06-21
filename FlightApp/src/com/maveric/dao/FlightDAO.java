package com.maveric.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.maveric.model.FlightBookingModel;

public class FlightDAO {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/flight";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public void flightToDB(FlightBookingModel flightBookingModel){
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String query = "INSERT INTO flightdetails "
				+ "(ID, flightName, flightSource, flightDestination, flightFare, flightSeat, flightAir) "
				+ " VALUES (1,'"
				+ flightBookingModel.getFlightName()+"','"
				+ flightBookingModel.getSource()+"', '"
				+ flightBookingModel.getDestination()+"', "
				+ flightBookingModel.getFare()+", "
				+ flightBookingModel.getNoOfSeats() +", '"
				+ flightBookingModel.getAircraftName() +"')";
			
				int result = stmt.executeUpdate(query);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			try{
		         if(stmt!=null)
		            stmt.close();
		     }catch(SQLException se){
		     }
		     try{
		        if(conn!=null)
		           conn.close();
		     }catch(SQLException se){
		        se.printStackTrace();
		     }
		}
		
		
	}

}
