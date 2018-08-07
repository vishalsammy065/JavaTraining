package com.deloitte;

public class Smartphone {
	String name;
	double price;
	Application app;
	Smartphone(Application app){
		this.app = app;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
