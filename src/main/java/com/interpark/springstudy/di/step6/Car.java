package com.interpark.springstudy.di.step6;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	// get/set ���� �޼ҵ带 ������ �ʾƵ� ���������� ���ؼ� �˾Ƽ� get/set ���� �޼��带 ����Ѵ�
	@Autowired
	Tire tire;

	public String getTireBrand() {
		return tire.getBrand();
	}
}
