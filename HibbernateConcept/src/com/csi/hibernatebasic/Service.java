package com.csi.hibernatebasic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Service {
	private static SessionFactory factory = new Configuration().configure().buildSessionFactory();
public static void main(String[] args) {
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	Employee e1 = new  Employee();
	e1.setEmpName("SWARA");
	e1.setEmpSalary(50000.56);
	session.save(e1);
	transaction.commit();
}
}
