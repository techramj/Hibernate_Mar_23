package com.seed;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Address;
import com.seed.entities.Employee;
import com.seed.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.openSession()){
			Transaction tx = session.beginTransaction();
			session.save(getEmployee());
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Employee getEmployee() {
		Employee emp = new Employee();
		emp.setName("Jack");
		emp.setSalary(5000);
		emp.setAddress(new Address("Pune", "411041"));
		
		return emp;
	}
}
