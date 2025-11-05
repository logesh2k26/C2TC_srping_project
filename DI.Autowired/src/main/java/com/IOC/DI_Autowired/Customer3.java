package com.IOC.DI_Autowired;

import org.springframework.stereotype.Component;

@Component
public class Customer3 {
	private int id;
	private String iname;
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
		System.out.println("customer3 i here");
	}
	
}
