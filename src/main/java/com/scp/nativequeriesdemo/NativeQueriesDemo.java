package com.scp.nativequeriesdemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NativeQueriesDemo {
	
    @SuppressWarnings({"unused","unchecked","deprecation"})
	public static void main(String[] args) {
		
		Student s1=new Student(1015, "Yog", "NIT");
		Student s2=new Student(1026, "viky", "NIT");
		Student s3=new Student(1038, "santy", "NIT");
		Student s4=new Student(1044, "Shiva", "NIT");
		Student s5=new Student(1059, "Rishi", "NIT");


		SessionFactory sf=new Configuration().configure("hibernate.cfg2.xml").buildSessionFactory();
		  Session session=sf.openSession();
		  Transaction tx=session.beginTransaction();
		  session.save(s1);
		  session.save(s2);
		  session.save(s3);
		  session.save(s4);
		  session.save(s5);
		  session.flush();
		  tx.commit();
		  

			Query hqlQueryGetStudentByName = session.getNamedQuery("@HQL_GET_ALL_STUDENT");
			//hqlQueryGetStudentByName.setString("stud_name","Shiva");
			List<Student> listOfObjectsHQLName  = hqlQueryGetStudentByName.list();
			System.out.println("HQL By Name -- "+listOfObjectsHQLName);
	}
			
    }
