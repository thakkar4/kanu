package com.itexps.sales;

public class Car {
	
	private int vin;
	private String make;
	private String color;
	private float price;
	
	
	@Override
	public String toString() {
		return "Car [vin=" + vin + ", make=" + make + ", color=" + color + ", price=" + price + "]";
	}
	public int getVin() {
		return vin;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
