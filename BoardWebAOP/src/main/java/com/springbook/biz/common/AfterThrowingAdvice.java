package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.springframework.format.annotation.NumberFormat;

public class AfterThrowingAdvice {
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getDeclaringTypeName();
		System.out.println(method + "() 메소드 수행 중 예외 발생");
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("부적합한 값이 입력되었습니다.");
		} else if(exceptObj instanceof NumberFormat) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		} else if(exceptObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
		
		// System.out.println("[예외 처리] " + method + "() 메소드 수행 중 발생된 예외 메세지 : " + exceptObj.getMessage());
	}
}
