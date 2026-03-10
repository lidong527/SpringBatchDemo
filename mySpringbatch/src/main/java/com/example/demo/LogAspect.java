package com.example.demo;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LogAspect {

	/**
	 * サービスの実行前にログを出力
	 * 対象:[Service]をクラス名に含んでいる
	 */
	 @Before("execution(* *..*.*Service.*(..))")
	 public void startLog(JoinPoint jp) {
		 log.info("メソッド開始：" + jp.getSignature());
	 }
	 
	 @After("execution(* *..*.*Service.*(..))")
	 public void endLog(JoinPoint jp) {
		 log.info("メソッド完了：" + jp.getSignature());
	 }
}

