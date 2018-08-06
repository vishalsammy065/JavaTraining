package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		
		Passport pp = new Passport();
		pp.setPpid(101);
		pp.setPpname("India");
		
		Person p = new Person();
		p.setName("Vishal");
		p.setPid(101);
		p.setPassport(pp);
		
		Transaction tx = s.beginTransaction();
		s.save(pp);
		s.save(p);
		tx.commit();
		System.out.println("Done");
	}

}
