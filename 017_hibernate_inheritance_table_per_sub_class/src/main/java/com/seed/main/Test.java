package com.seed.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.entities.SalesPerson;
import com.seed.entities.WageEmployee;
import com.seed.util.HibernateUtil;

public class Test {
	
	public static void addThreeObject() {
		Employee emp = new Employee("Jack", 1000);
		WageEmployee we = new WageEmployee("Sam", 6000, 10, 200);
		SalesPerson sp = new SalesPerson("Jessica", 5000, 500000, .01);
	
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Transaction transaction = null;
		try (Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			session.save(emp);
			session.save(we);
			session.save(sp);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		addThreeObject();
		
	}

}
