package com.interpark.springstudy.di.step3;

public class Driver {

	// 속성을 통한 의존성 주입
	public static void main(String[] args) {
		Tire tire = new KoreaTire();
		Car car = new Car();
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
		
	}

}
