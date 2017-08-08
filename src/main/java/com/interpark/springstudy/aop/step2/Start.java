package com.interpark.springstudy.aop.step2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring/spring-aop.xml");

		Person romeo = (Person) context.getBean("boy");

		romeo.housework();

	}

}
