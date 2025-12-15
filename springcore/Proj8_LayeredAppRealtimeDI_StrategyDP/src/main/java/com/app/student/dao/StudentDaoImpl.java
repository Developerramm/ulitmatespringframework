package com.app.student.dao;

import javax.sql.DataSource;

import com.app.student.entity.StudentEntity;

public class StudentDaoImpl implements StudentDao {
	
	private final static String INSERT_STUDENT = "INSERT INTO student_details"
			+ "(id,name,email,course_name,obtained_marks, grade) values(?,?,?,?,?,?)";
	
	private DataSource dataSource;
	
	public StudentDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public int saveStudent(StudentEntity entity) {
		// TODO Auto-generated method stub
		return 0;
	}

}
