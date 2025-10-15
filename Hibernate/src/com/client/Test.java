package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Test {
	public static void main(String[] args) {
        
            // Load Hibernate configuration
            Configuration conf = new Configuration();
            conf.configure("hibernate.cfg.xml");

            // Build SessionFactory
            SessionFactory sessionFactory = conf.buildSessionFactory();

            // Open session
            Session session = sessionFactory.openSession();

            // Begin transaction
            Transaction tx = session.beginTransaction();

            // Create Student object
            Student student = new Student(101, "Socket", "Pune");

            // Save the student
            session.save(student);

            // Commit transaction
            tx.commit();

            // Close resources
            session.close();
            

            System.out.println("✅ Record inserted successfully!");
       
    }
}
