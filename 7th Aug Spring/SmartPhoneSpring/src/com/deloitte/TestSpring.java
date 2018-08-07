package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
		Smartphone sp = (Smartphone)ac.getBean("smartPhone");
		System.out.println(sp.getName() + sp.getPrice() + sp.app.getName() + sp.app.getType());
		
		Smartphone sp2 = (Smartphone) ac.getBean("smartPhone");
		
		//singleton design, only one object but different references 
		//therefore, the below code gives true
		//System.out.println(sp.hashCode() == sp2.hashCode());
		
		//putting scope="prototype" creates different object
		//System.out.println(sp.hashCode() == sp2.hashCode());
	}
}
