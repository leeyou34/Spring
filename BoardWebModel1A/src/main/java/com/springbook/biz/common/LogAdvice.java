package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // Aspect = Pointcut + Advice
public class LogAdvice {
	//public void printLog(JoinPoint jp) {
	//	System.out.println("[공통 로그] 비지니스 로직 수행 전 동작");
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))") // 포인트 컷
	public void allPointcut() {}
	
	//public void printLog(JoinPoint jp) {
	
	@Before("allPointcut()") // 어드바이스
	public void printLog() {
		System.out.println("[공통 로그] 비지니스 로직 수행 전 동작");
	}	
	
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
}

