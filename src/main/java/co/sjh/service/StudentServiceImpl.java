package co.sjh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.sjh.dao.StudentDao;
import co.sjh.domain.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public long count() {
		return studentDao.count();
	}

	@Transactional
	public void save(Student student) {
		studentDao.save(student);
		// To check transaction logic
		//throw new RuntimeException();
	}
	
	public List<Student> findAll() {
		return studentDao.findAll();
	}
	
}
