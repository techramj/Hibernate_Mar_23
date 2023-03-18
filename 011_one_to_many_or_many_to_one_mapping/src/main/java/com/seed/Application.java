package com.seed;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.entities.Passport;
import com.seed.util.HibernateUtil;

public class Application {
	
	public static void addEmployees(List<Employee> empList) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.openSession()){
			Transaction tx = session.beginTransaction();
			for(Employee emp:empList) {
				session.save(emp);
			}
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		List<Employee> list = getEmployees();
		addEmployees(list);
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1  = new Employee("Ashish", 8000);
		Passport p1 = addPassport("ABCDJ99121C");
		e1.setPassport(p1);
		
		
		Employee e2  = new Employee("Ajay", 7000);
		Passport p2 = addPassport("ABCDJ991222");
		e2.setPassport(p2);

		
		Employee e3  = new Employee("Komal", 7500);
		Passport p3 = addPassport("ABCDJ99133");
		e3.setPassport(p3);

		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		
		return empList;
	}
	
	public static Passport addPassport(String passportNo) {
		Passport passport = new Passport(passportNo, new Date());
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.openSession()){
			Transaction tx = session.beginTransaction();
			Object ob = session.save(passport);
			System.out.println(ob);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return passport;
	}
	
	public static Employee getEmployee() {
		Employee emp = new Employee();
		emp.setName("Jack");
		emp.setSalary(5000);
		return emp;
	}
}
