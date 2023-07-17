package com.jsp.Pen;

public class Pen {
	private String name;
	private String color;
	private double price;
	
	// Using Constructor
	
	Pen(String name,String color,double price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public void printPenDetails() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}

}
