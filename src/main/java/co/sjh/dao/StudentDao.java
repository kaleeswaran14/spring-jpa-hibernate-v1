package co.sjh.dao;

import java.util.List;

import co.sjh.domain.Student;

public interface StudentDao {

	List<Student> findAll();

	long count();

	void save(Student student);

}