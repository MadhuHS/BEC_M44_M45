package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

		final String dbUrl = "jdbc:mysql://127.0.0.1:3306/StudentsDB";
		final String username = "root";
		final String password = "root";
		 Connection con = null;

		try 
		{	
		    con = DriverManager.getConnection(dbUrl,username,password);	
			System.out.println("Connected to DB");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				con.close();
				System.out.println("Disconnected from DB");  
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("Program ends...");
	}
}
