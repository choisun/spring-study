package com.interpark.springstudy.di.step2;

public class Driver {

	// �����ڸ� ���� ������ ����
	public static void main(String[] args) {
		Tire tire = new AmericaTire();
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());
		
	}

}
