package com.sanket;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Student student = (Student) session.find(Student.class, 1);
		session.remove(student);
		transaction.commit();
		session.close();
		System.out.println("Record Removed..");

	}

}
