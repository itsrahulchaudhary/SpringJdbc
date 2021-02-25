package com.springjdbc.usingXml.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.withoutXml.api.Student;

public class StudentDAOImp implements StudentDAO {

	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

	@Override
	public void insert(Student student) {
		String sql = "INSERT INTO STUDENT VALUES (?,?,?)";
		Object args[] = { student.getRollNo(), student.getName(), student.getAddress() };
		int noOfRow = jdbcTemplate.update(sql, args);

		System.out.println("No of Row Inserted : " + noOfRow);

	}

	public DataSource getDataSource() {

		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";

		DataSource dataSource = new DriverManagerDataSource(url, username, password);

		return dataSource;
	}

}
