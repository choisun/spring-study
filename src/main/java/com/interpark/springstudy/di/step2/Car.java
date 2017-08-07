package com.interpark.springstudy.di.step2;

public class Car {
	Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return tire.getBrand();
	}
}
