package com.demo.enums;

public enum Coffee {

	small(15,150.0),medium(10,200.0),large(10,250.0);
	
	private int size;
	private double price;
	private Coffee(int size, double price) {
		this.size = size;
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	
	public double getPrice() {
		return price;
	}
	
}
