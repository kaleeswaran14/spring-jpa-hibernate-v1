package co.javatoday.spring.jpa.hibernate.dao;

import java.util.List;

import co.javatoday.spring.jpa.hibernate.domain.Student;

public interface StudentDao {

	List<Student> findAll();

	long count();

	void save(Student student);

}