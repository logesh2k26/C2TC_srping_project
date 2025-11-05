package com.IOC.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer1 {
	private int id;
	private String Lname;
@Autowired
	
	Customer2 cust2;
@Autowired
	Customer3 cust3;
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
		System.out.println("Customer_1 object printed");
		cust2.show();
		cust3.show();
	}
}
