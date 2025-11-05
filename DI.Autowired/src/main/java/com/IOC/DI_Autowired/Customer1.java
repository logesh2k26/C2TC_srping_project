package com.IOC.DI_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer1 {
	private int id;
	private String iname;
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
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public void show()
	{
		System.out.println("customer1 i here");
	}
	
}
