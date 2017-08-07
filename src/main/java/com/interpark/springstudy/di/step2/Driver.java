package com.interpark.springstudy.di.step2;

public class Driver {

	// 생성자를 통한 의존성 주입
	public static void main(String[] args) {
		Tire tire = new AmericaTire();
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());
		
	}

}
