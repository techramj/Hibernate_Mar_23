package com.seed.service;

import com.seed.dao.StudentDao;
import com.seed.dao.StudentDaoImpl;
import com.seed.entities.Student;

public class StudentService {
	
	private StudentDao dao = new StudentDaoImpl();
	
	public Student addStudent(Student student) {
		return dao.addStudent(student);
	}

}
