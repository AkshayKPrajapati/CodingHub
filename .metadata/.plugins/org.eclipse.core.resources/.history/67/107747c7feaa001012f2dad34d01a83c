package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

/* Student Class Session CRUD Operation */
public class StudentCrud {
	
	public static void main(String[] args) {
		
		//Configuration object 
		 Configuration configuration = new Configuration();
		 configuration.configure("hibernate.cfg.xml");
		 
		 //SessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//Session
		Session session=sessionFactory.openSession();
		
		//transaction
		Transaction transaction=session.beginTransaction();
		
		//Create object of the student Class // Student Model Class
		Student student=new Student(105,"Pinki","JHR");
		
		// save and commit 
		session.save(student);
		transaction.commit();
		
		// get all data form Student Class
		Student st = session.get(Student.class,101);
		System.out.println(st.getRollNumber()+" "+st.getName()+" "+ st.getAddress());
		
		
		// close Resource
		session.close();
		System.out.println("Data Inserted Successfully");
		
	}
}
