package co.javatoday.spring.jpa.hibernate.service;

import java.util.List;

import co.javatoday.spring.jpa.hibernate.domain.Student;

public interface StudentService {

	public long count();

	public void save(Student student);
	
	public List<Student> findAll();
	
}
