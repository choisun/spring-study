package com.interpark.springstudy.di.step4;

public class Car {
	Tire tire;
	
	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public String getTireBrand() {
		return tire.getBrand();
	}
}