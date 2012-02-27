package co.sjh;

import java.util.List;

import co.sjh.domain.Student;
import co.sjh.service.StudentService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"spring-beans.xml"});
		
		StudentService studentService = appContext.getBean("studentService", StudentService.class);

		// create new Student
		Student student = new Student();
		student.setName("Alexander");

		// get from db
		System.out.println("Count of students: " + studentService.count());
		// save to db
		studentService.save(student);
		// get from db
		System.out.println("Count of students: " + studentService.count());
		
		// list all students
		List<Student> students = studentService.findAll();
		for(Student entity : students) {
			System.out.println(entity);
		}
		
	}

}
