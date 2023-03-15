package com.seed.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Student;
import com.seed.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {
	
	private SessionFactory factory = HibernateUtil.getSessionFactory();
	
	@Override
	public Student addStudent(Student student) {
		Transaction transaction = null;
		try(Session session = factory.openSession()){
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return student;
	}
}
