package co.sjh.service;

import java.util.List;

import co.sjh.domain.Student;

public interface StudentService {

	public long count();

	public void save(Student student);
	
	public List<Student> findAll();
	
}
