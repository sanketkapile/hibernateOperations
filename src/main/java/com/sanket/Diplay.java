package com.sanket;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Diplay {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		List<Student> students = session.createQuery("from Student_info", Student.class).getResultList();
		session.getTransaction().commit();
		
		for (Student student : students) {
			System.out.println(student);
		}
	
		transaction.commit();
		session.close();
	}
}
