package com.tnsif.di_qualifier;

import org.springframework.stereotype.Component;

@Component
public class Medicals implements Ordering {

	public void order() {
		System.out.println("Ordering Medical Products");
	}

}
