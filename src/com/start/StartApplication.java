package com.start;

import java.sql.Connection;
import java.util.Scanner;

import com.connection.DBConnect;
import com.dao.EmployeeDAO;
import com.entity.Employee;

public class StartApplication {

	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Welcome To Employee Management System");
			System.out.println("1. Add Employee ");
			System.out.println("2. Display Employee ");
			System.out.println("3. Update Employee ");
			System.out.println("4. Delete Employee ");
			System.out.println("5. Exit !! ");
			
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1 :
				System.out.println("Enter employee name : ");
				String name = sc.nextLine();
				
				System.out.println("Enter employee phone : ");
				String phone = sc.nextLine();
				
				System.out.println("Enter employee address : ");
				String address = sc.nextLine();
				
				System.out.println("Enter employee email : ");
				String email = sc.nextLine();
				
				System.out.println("Enter employee password : ");
				String password = sc.nextLine();
				
				Employee emp = new Employee(name,phone,address,email,password);
				
				EmployeeDAO dao = new EmployeeDAO(DBConnect.getConn());
				
				boolean isSucessfull = dao.addEmployee(emp);
				
				if(isSucessfull)
				{
					System.out.println("Data Added Sucessfully");
				}
				else
				{
					System.out.println("Something went wrong !!! ");
				}
				
				
				break;
				
			case 2: 
				
				EmployeeDAO.showEmployees();
				break;
				
			case 3: 
				System.out.println("PRESS 1 to UPDATE name");
				System.out.println("PRESS 2 to UPDATE phone");
				System.out.println("PRESS 3 to UPDATE address");
				System.out.println("PRESS 4 to UPDATE email");
				System.out.println("PRESS 5 to UPDATE password");
				
				int select = sc.nextInt();
				
				if(select == 1)
				{
					System.out.println("Enter name to UPDATE...");
					String newName = sc.next();
					System.out.println("Enter ID to identify employee!");
					int id = Integer.parseInt(sc.next());
					Employee empl = new Employee();
					empl.setName(newName);
					boolean f = EmployeeDAO.updateEmployee(empl);
					if(f) {
						System.out.println("Employee Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(select == 2)
				{
					System.out.println("Enter phone to UPDATE...");
					String phoneNew = sc.next();
					System.out.println("Enter ID to identify employee!");
					int id = Integer.parseInt(sc.next());
					Employee empl = new Employee();
					empl.setPhone(phoneNew);
					boolean f = EmployeeDAO.updateEmployee(empl);
					if(f) {
						System.out.println("Employee Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(select == 3)
				{
					System.out.println("Enter address to UPDATE...");
					String addressNew = sc.next();
					System.out.println("Enter ID to identify employee!");
					int id = Integer.parseInt(sc.next());
					Employee empl = new Employee();
					empl.setAddress(addressNew);
					boolean f = EmployeeDAO.updateEmployee(empl);
					if(f) {
						System.out.println("Employee Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(select == 4)
				{
					System.out.println("Enter email to UPDATE...");
					String emailNew = sc.next();
					System.out.println("Enter ID to identify employee!");
					int id = Integer.parseInt(sc.next());
					Employee empl = new Employee();
					empl.setEmail(emailNew);
					boolean f = EmployeeDAO.updateEmployee(empl);
					if(f) {
						System.out.println("Employee Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(select == 5)
				{
					System.out.println("Enter password to UPDATE...");
					String passwordNew = sc.next();
					System.out.println("Enter ID to identify employee!");
					int id = Integer.parseInt(sc.next());
					Employee empl = new Employee();
					empl.setPassword(passwordNew);
					boolean f = EmployeeDAO.updateEmployee(empl);
					if(f) {
						System.out.println("Employee Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else {
					System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
				}
				
				
				break;
				
				
			case 4:
				
				System.out.println("Enter the Employee ID to delete");
				int userID = sc.nextInt();
				
				boolean isSuccessfull = EmployeeDAO.deleteEmployee(userID);
				
				
				if(isSuccessfull)
				{
					System.out.println("Employee deleted Successfully");
				}
				else
				{
					System.out.println("Something went wrong !!!");
				}
				break;
				
			case 5:
				System.out.println("Exiting....");
				break;
				
			default:
				System.out.println("Please enter the valid input");
				break;
					
			}
			
			
		}while(choice != 5);
		
	}

}
