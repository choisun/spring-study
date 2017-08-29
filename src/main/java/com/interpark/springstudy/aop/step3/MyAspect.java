package com.interpark.springstudy.aop.step3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* housework())") // method가 실행되기 전에 실행해라
	public void before(JoinPoint joinPoint) {
//		System.out.println("얼굴 인식 확인: 문을 개방하라");
		 System.out.println("열쇠로 문을 열고 집에 들어간다.");
	}

	@After("execution(* housework())")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("자물쇠를 잠그고 집을 나선다.");
	}
	
//	@Around("execution(* housework())")
//	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("aaa");
//	}
}
