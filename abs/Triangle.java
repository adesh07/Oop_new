package com.abs;

public class Triangle extends Shape{
	
	private int height;
	private int base;
	
	
	Triangle(){}
	
	Triangle(int base, int height){
		this.height = height;
		this.base = base;
	}

	public double area() {
		double tarea = (height * base)/2;
		return tarea;
	}

	
	public void area(int bw, String colour) {
	
	}
}
