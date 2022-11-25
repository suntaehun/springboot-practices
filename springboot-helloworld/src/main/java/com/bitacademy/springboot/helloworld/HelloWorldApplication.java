package com.bitacademy.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// 1. 스프링 어플리케이션의 부트스트래핑 역할(Bootstraping Class)
// 2. 설정 클래스 역할(Configuration Class)

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 *  SpringApplication.run(...) 안에서 일어나는 일(Bootstrap)
		 * 
		 *  1. 어플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 *  2. 만약 웹어플리케이션이면, 웹 어플리케이션 타입을 결정(Spring MVC or Reactive)
		 *  3. 어노테이션 스캐닝(Auto) + Configuration Class(Explicity) 통한 빈 생성/등록/와이어링 작업
		 *  4. 만약 웹어플리케이션이고 Spring MVC이면 
		 *  	- 내장(embeded) 서버(TomcatEbeddedServiceServletContainer) 인스턴스 생성
		 *  	- 서버 인스턴스에 웹 어플리케이션을 배포
		 *  	- 서버 인스턴스 실행
		 *  5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행(run 호출)
		 */
//		 ConfigurableApplicationContext ac = null;
//		 try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		 } catch(Throwable ex) {
//			ex.printStackTrace();
//		 } finally {
//			ac.close();
//		 }
		
//		try ~ with ~ resources 구문
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){}
		
	}

}
