package com.spring.core.basedonannotation.autoscan.bean;

import org.springframework.stereotype.Component;

@Component
public class Black {
	
	public Black() {
		System.out.println("Initial Black Class");
	}
	
	public void show() {
		System.out.println("Black");
	}
}
