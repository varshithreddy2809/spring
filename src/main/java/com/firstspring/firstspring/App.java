package com.firstspring.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
		Employee emp2 = (Employee)context.getBean("emp");
		System.out.println(emp2.getEid());
		System.out.println(emp2.getEname());
	}
}
