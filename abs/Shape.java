package com.abs;

public abstract class Shape {

	private String colour;
	private int borderWidth;
	
	
	Shape() {	
	}
	
	Shape (String colour, int bw) {

		this.colour = colour;
		this.borderWidth = bw;
		System.out.println("Shape constructor");
	}
	
	public abstract double area();
	
	public abstract void area(int bw, String colour);
}
