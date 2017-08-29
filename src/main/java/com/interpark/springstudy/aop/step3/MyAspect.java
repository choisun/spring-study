package com.interpark.springstudy.aop.step3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* housework())") // method�� ����Ǳ� ���� �����ض�
	public void before(JoinPoint joinPoint) {
//		System.out.println("�� �ν� Ȯ��: ���� �����϶�");
		 System.out.println("����� ���� ���� ���� ����.");
	}

	@After("execution(* housework())")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("�ڹ��踦 ��װ� ���� ������.");
	}
	
//	@Around("execution(* housework())")
//	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("aaa");
//	}
}
