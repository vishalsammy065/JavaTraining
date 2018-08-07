package com.deloitte;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		CollectionExample ce = (CollectionExample) con.getBean("coll");
		System.out.println(ce.getCityList());
		System.out.println(ce.getCitySet());
		System.out.println(ce.getCityMap());
		System.out.println(ce.getProp());
	}
}
