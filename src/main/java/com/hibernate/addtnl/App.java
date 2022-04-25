package com.hibernate.addtnl;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.hibernate.addtnl.entities.Employee;
import com.hibernate.addtnl.entities.EmployeeComposite;
import com.hibernate.addtnl.entities.Student;

public class App {
	public static void main(String[] args) {
//		SessionFactory factory = 
//				new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
		
//		saving employee having composite key
//		EmployeeComposite ec = new EmployeeComposite();
//		ec.setCompanyId(2);
//		ec.setEmployeeId(2002);
//		Employee e = new Employee();
//		e.setName("neko");
//		e.setCity("delhi");
//		e.setComposite(ec);
//		session.save(e);
		
		
//		fetching employee having composite key
//		EmployeeComposite ec = new EmployeeComposite();
//		ec.setCompanyId(1);
//		ec.setEmployeeId(1001);
//		Employee e = session.get(Employee.class, ec);
//		System.out.println(e);
		
//		tx.commit();
//		session.close();
//		factory.close();
		
//		configuring hibernate without xml
		
		Properties p = new Properties();
		p.put(Environment.USER, "root");
		p.put(Environment.PASS, "faisal");
		p.put(Environment.URL, "jdbc:mysql://localhost:3306/jdbc");
		p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		p.put(Environment.HBM2DDL_AUTO, "update");
		p.put(Environment.SHOW_SQL, "true");
		p.put(Environment.FORMAT_SQL, "true");
		
		Configuration cfg = new Configuration().
				addProperties(p).addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		Student s = new Student(1111, "nerdguy007");
//		session.save(s);
		
//		Student s = session.get(Student.class, 1111);
//		System.out.println(s);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
