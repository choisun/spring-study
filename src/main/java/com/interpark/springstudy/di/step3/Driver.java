package com.interpark.springstudy.di.step3;

public class Driver {

	// �Ӽ��� ���� ������ ����
	public static void main(String[] args) {
		Tire tire = new KoreaTire();
		Car car = new Car();
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
		
	}

}
