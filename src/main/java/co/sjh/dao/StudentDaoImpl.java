package co.sjh.dao;

import java.util.List;

import co.sjh.domain.Student;

import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class StudentDaoImpl extends JpaDaoSupport implements StudentDao {

	@SuppressWarnings("unchecked")
	public List<Student> findAll() {
		return getJpaTemplate().find("from Student");
	}

	public long count() {
		return (Long) getJpaTemplate().getEntityManagerFactory()
				.createEntityManager()
				.createQuery("select count(s) from Student s").getSingleResult();
	}

	@Transactional
	public void save(Student student) {
		getJpaTemplate().persist(student);
	}

}
