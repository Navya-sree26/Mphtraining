package com.mph.util;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class MyDBConnection {

	
		
static Connection con;
public static Connection getDBconnection()
{
	try
	{
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sree");
}
catch(SQLException e)
{
e.printStackTrace();	
}
	return con;
	}


public static void main(String[] args)
{
	System.out.println(getDBconnection());
}
}
