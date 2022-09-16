package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.entity.Employee;

public class EmployeeDAO {

	
	private static Connection conn;
	 
	public EmployeeDAO(Connection conn)
	{
		super();
		this.conn = conn;
	}
	
	public boolean addEmployee(Employee employee)
	{
		boolean result = false;
		
		try
		{
			
			String query = "insert into users(name,phone,address,email,password) values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1,employee.getName());
			ps.setString(2,employee.getPhone());
			ps.setString(3,employee.getAddress());
			ps.setString(4,employee.getEmail());
			ps.setString(5,employee.getPassword());
			
			int i = ps.executeUpdate();
			
			if(i == 1)
			{
				result = true;
			}
					
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return result;
	}

	public static boolean deleteEmployee(int userID) {
		
        boolean result = false;
		
		try
		{
			
			String query = "delete from users where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1,userID);
			
			int i = ps.executeUpdate();
			
			if(i == 1)
			{
				result = true;
			}
					
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return result;
		
	}

	public static boolean showEmployees() {
		
        boolean result = false;
		
		try
		{
			
			String query = "select * from users";
			
			Statement stmt = conn.createStatement();
			ResultSet set = stmt.executeQuery(query);
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String address = set.getString(4);
				String email = set.getString(5);
				String password = set.getString(6);
				
				System.out.println("__________________________");
				System.out.println(" ID : "+id);
				System.out.println(" Name : "+name);
				System.out.println(" Phone : "+phone);
				System.out.println(" Address : "+address);
				System.out.println(" Email : "+email);
				System.out.println(" Password : "+password);
				System.out.println("__________________________");
			}
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}

	
	public static boolean updateEmployee(Employee employee)
	{
		boolean f = false;
		
		try {
			
			String sqlUPD = "update customers set name=?,phone=?,address=?,email=?,password=?,phone=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sqlUPD);
			
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getPhone());
			ps.setString(3, employee.getAddress());
			ps.setString(4, employee.getEmail());
			ps.setString(5, employee.getPassword());
			ps.setInt(6, employee.getId());
			
		    int i = ps.executeUpdate();
		    
		    if(i==1)
		    {
		    	f  = true;
		    }
		    
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return f;
	}
	
}
