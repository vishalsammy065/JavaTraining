package com.deloitte;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;
import java.util.List;
public class HibernateDemo {

	public static void main(String[] args) {
		 Configuration c = new Configuration();
		 c.configure("hibernate.cfg.xml");
		 SessionFactory sf=c.buildSessionFactory();
		 Session s = sf.openSession();
		 
		 Laptop l = new Laptop();
		 l.setId(2);
		 l.setBrandName("Dell");
		 l.setPrice(4000.0);
		 
		 //it will map and save the pojo in db
		 Transaction tx = s.beginTransaction();
		 tx.begin();
		 /*s.save(l);*/
		 
		 //Select query
		 /*Query query = s.createQuery("from com.deloitte.Laptop");
		 List lisObj = query.list();
		 Iterator itr = lisObj.iterator();
		 while(itr.hasNext()) {
			 Laptop l1 = (Laptop) itr.next();
			 System.out.println(l1.getId()+" "+l1.getBrandName() );
		 }*/
		 
		 //conditions
		 Criteria cr = s.createCriteria(Laptop.class);
		 cr.add(Restrictions.gt("price", 3500.0));
		 List lisObj = cr.list();
		 Iterator itr = lisObj.iterator();
		 while(itr.hasNext()) {
			 Laptop l1 = (Laptop) itr.next();
			 System.out.println(l1.getId()+" "+l1.getBrandName() );
		 }
		 tx.commit();
	}

}
