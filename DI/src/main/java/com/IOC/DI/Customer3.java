package com.IOC.DI;

import org.springframework.stereotype.Component;

@Component
public class Customer3 {
	private int id;
	private String Lname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public void show()
	{
		System.out.println("Customer_3 object printed");
	}
}
