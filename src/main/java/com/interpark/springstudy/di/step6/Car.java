package com.interpark.springstudy.di.step6;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	// get/set 접근 메소드를 만들지 않아도 설정파일을 통해서 알아서 get/set 접근 메서드를 대신한다
	@Autowired
	Tire tire;

	public String getTireBrand() {
		return tire.getBrand();
	}
}
