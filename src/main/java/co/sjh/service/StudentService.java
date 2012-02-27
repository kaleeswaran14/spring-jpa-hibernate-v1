package co.sjh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sjh.dao.StudentDao;
import co.sjh.domain.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public long count() {
		return studentDao.count();
	}

	public void save(Student student) {
		studentDao.save(student);
	}
	
	public List<Student> findAll() {
		return studentDao.findAll();
	}
	
}
