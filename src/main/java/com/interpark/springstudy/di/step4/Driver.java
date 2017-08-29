package com.interpark.springstudy.di.step4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {

	// xml 파일을 사용하여 속성 주입
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring/di/spring-di.xml");
		Tire tire = (Tire)context.getBean("tire");
		Car car = (Car)context.getBean("car");
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
		
	}

}
