package com.deloitte;

public class Computer {
	String brandName;
	CPU cpu;
	Keyboard kb;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Keyboard getKb() {
		return kb;
	}
	public void setKb(Keyboard kb) {
		this.kb = kb;
	}
	
}
