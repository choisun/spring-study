package com.interpark.springstudy.di.step6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {

	// 스프링 설정 파일에서 속성 주입
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring/di/spring-di3.xml");

		Car car = (Car)context.getBean("car");
		
		System.out.println(car.getTireBrand());
		
	}

}
