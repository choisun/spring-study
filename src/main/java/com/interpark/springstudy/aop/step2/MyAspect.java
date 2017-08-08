package com.interpark.springstudy.aop.step2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(public void com.interpark.springstudy.aop.step2.Boy.housework())")
	public void before(JoinPoint joinPoint) {
		System.out.println("�� �ν� Ȯ��: ���� �����϶�");
		// System.out.println("����� ���� ���� ���� ����.");
	}

}
