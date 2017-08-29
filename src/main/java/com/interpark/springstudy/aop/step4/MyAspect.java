package com.interpark.springstudy.aop.step4;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	
	public void before(JoinPoint joinPoint) {
//		System.out.println("얼굴 인식 확인: 문을 개방하라");
		 System.out.println("열쇠로 문을 열고 집에 들어간다.");
	}

	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("자물쇠를 잠그고 집을 나선다.");
	}
}
