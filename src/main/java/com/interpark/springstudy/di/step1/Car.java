package com.interpark.springstudy.di.step1;

public class Car {
	Tire tire;
	
	public Car() {
		tire = new KoreaTire();
	}
	
	public String getTireBrand() {
		return tire.getBrand();
	}
}
