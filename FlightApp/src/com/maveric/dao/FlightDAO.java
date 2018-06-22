package com.maveric.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
			System.out.println("Query"+query);
				int result = stmt.executeUpdate(query);
				System.out.println("Querexecuted"+result);
			
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
	
	public List<FlightBookingModel> flightList(){
		
		Connection conn = null;
		Statement stmt = null;
		List<FlightBookingModel> bookingModels = new ArrayList<FlightBookingModel>();
		FlightBookingModel bookingModel = new FlightBookingModel();
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String query = "select * from flightdetails ";
			
			ResultSet resultSet = stmt.executeQuery(query);
			
			while(resultSet.next()) {
				bookingModel = new FlightBookingModel();
				bookingModel.setFlightName(resultSet.getString("flightName"));
				bookingModel.setAircraftName(resultSet.getString("flightAir"));
				bookingModel.setDestination(resultSet.getString("flightDestination"));
				bookingModel.setSource(resultSet.getString("flightSource"));
				bookingModel.setFare(Double.valueOf(resultSet.getString("flightFare")));
				bookingModel.setNoOfSeats(Integer.valueOf(resultSet.getString("flightSeat")));
				bookingModels.add(bookingModel);
			}
			
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
		return bookingModels;
	}

}
