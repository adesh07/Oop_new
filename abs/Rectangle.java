package com.abs;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	Rectangle(){}
	
	Rectangle(int length, int width){
		super("awd", 10);
		this.length = length;
		this.width = width;
	}

	public double area() {
		double rarea = length * width;
		System.out.println(rarea);
		return rarea;
	}

	public void area(int bw, String colour) {
		
	}
}
