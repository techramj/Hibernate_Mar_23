package com.seed;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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
		
		Address brotherAddress = new Address("pune", "123456");
		brotherAddress.setRelation("brother");
		
		Address sisterAddress = new Address("mumbai", "123457");
		sisterAddress.setRelation("sister");
		
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(brotherAddress);
		addressList.add(sisterAddress);
		emp.setParentAddress(addressList);
		
		emp.setSkills(new HashSet<String>(Arrays.asList("Java","Spring","Hibernate")));
		emp.setProjects(Arrays.asList("EMS", "Banking_AI"));
		
		return emp;
	}
}
