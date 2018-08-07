package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld hw = (HelloWorld) con.getBean("helloWorld");
		System.out.println(hw.getMessage1());
		System.out.println(hw.getMessage2());
		HelloIndia hi = (HelloIndia) con.getBean("helloIndia");
		System.out.println(hi.getMessage1());
		System.out.println(hi.getMessage2());
		System.out.println(hi.getMessage3());
	}

}
