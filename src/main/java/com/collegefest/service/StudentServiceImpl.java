package com.collegefest.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.collegefest.model.Student;

@Repository
public class StudentServiceImpl implements StudentService {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Student> findAll() {
		Session session = this.sessionFactory.openSession();
		List<Student> list = session.createQuery("from Student").list();
		session.close();
		return list;
	}

	@Override
	public void save(Student theStudent) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(theStudent);
		tx.commit();
		session.close();
	}

	@Override
	public Student findById(int studentId) {
		Session session = this.sessionFactory.openSession();
		Student student = session.get(Student.class, studentId);
		session.close();
		return student;
	}

	@Override
	public void deleteById(int studentId) {
		Session session = this.sessionFactory.openSession();
		Student student = findById(studentId);
		if (student != null) {
			Transaction tx = session.beginTransaction();
			session.delete(student);
			tx.commit();
		}
		session.close();
	}

}
