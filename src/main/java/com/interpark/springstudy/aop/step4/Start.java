package com.interpark.springstudy.aop.step4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring/aop/spring-aop3.xml");

		Person romeo = (Person) context.getBean("boy");
		Person juliet = (Person) context.getBean("girl");

		romeo.housework();
		juliet.housework();

	}

}
