package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object AroundLog(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("[BEFORE]: 비지니스 메소드 수행 전에 처리할 내용...");
		Object returnObj= pjp.proceed();
		System.out.println("[AFTER]: 비지니스 메소드 수행 후에 처리할 내용...");
		return returnObj;
	}
}
