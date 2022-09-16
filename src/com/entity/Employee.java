package com.entity;

public class Employee {

	private int id;
	private String name;
	private String phone;
	private String address;
	private String email;
	private String password;
	
	
	public Employee() {
		super();
	}

	
	public Employee(String name, String phone, String address, String email, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	

	public Employee(int id, String name, String phone, String address, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.password = password;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
	
	
}
