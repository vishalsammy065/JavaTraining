package com.deloitte;
      
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Computer computer = (Computer) context.getBean("comp");
		System.out.println(computer.getBrandName());
		System.out.println("CPU Name is : "+computer.cpu.getCpuName());
		System.out.println("KB is : " + computer.kb.getKeyboardBrand());
	}
}
