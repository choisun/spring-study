package com.interpark.springstudy.aop.step4;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	
	public void before(JoinPoint joinPoint) {
//		System.out.println("�� �ν� Ȯ��: ���� �����϶�");
		 System.out.println("����� ���� ���� ���� ����.");
	}

	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("�ڹ��踦 ��װ� ���� ������.");
	}
}
