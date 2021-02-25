package com.springjdbc.withoutXml.test;

import com.springjdbc.withoutXml.api.Student;
import com.springjdbc.withoutXml.dao.StudentDAO;
import com.springjdbc.withoutXml.dao.StudentDAOImp;

public class Test {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollNo(101);
		s1.setName("Rahul");
		s1.setAddress("Noida");
		
		StudentDAO studentDao = new StudentDAOImp();
		studentDao.insert(s1);
		
	}

}
