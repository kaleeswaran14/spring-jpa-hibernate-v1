package co.javatoday.spring.jpa.hibernate.dao;

import java.util.List;

import co.javatoday.spring.jpa.hibernate.domain.Student;

import org.springframework.orm.jpa.support.JpaDaoSupport;

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

	public void save(Student student) {
		getJpaTemplate().persist(student);
	}

}
