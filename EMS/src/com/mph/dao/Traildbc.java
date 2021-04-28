package com.mph.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mph.model.Employee;
import com.mph.util.MyDBConnection;

public class Traildbc {

	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public void creTab() throws IOException
	{
		con =MyDBConnection.getDBconnection();
		try 
		{
			st=con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter table name");
			String tableName = br.readLine();
			String sqlStatement = "create table "+tableName+" (num number(4),name varchar2(10),city varchar2(5))";
			st.executeUpdate(sqlStatement);
			System.out.println("Table" +tableName+ "created successfully");	
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public void insertEmp(Employee emp)
	{
		con =MyDBConnection.getDBconnection();
		
		try
		{
			ps=con.prepareStatement("insert into mphemp(eid,ename,dept) values(?,?,?)");
			ps.setInt(1,emp.getEid());
			ps.setString(2,emp.getEname());
			ps.setString(3,emp.getDept());
			
			int noofrows=ps.executeUpdate();
			System.out.println(noofrows+"inserted");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void viewEmp()
	{
		con =MyDBConnection.getDBconnection();
		try {
			st =con.createStatement();
			rs=st.executeQuery("select * from mphemp");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				
			}
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		
	
	
	
	
}
