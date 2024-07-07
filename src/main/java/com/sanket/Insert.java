package com.sanket;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = new Student();
		student.setStudentName("Leela");
		student.setStudentAddress("Mumbai");
		student.setContactNumber(654321);
		//session.save(student);
		session.persist(student);
		transaction.commit();
		session.close();
		System.out.println("Record Added..");

	}

}
