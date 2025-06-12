package com.yeasin;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.setSid(5);
       s1.setSname("Yeasin Arafat");
       s1.setMarks(25);

       SessionFactory sf = new Configuration().addAnnotatedClass(com.yeasin.Student.class).configure().buildSessionFactory();
       Session session = sf.openSession();

       Transaction transaction = session.beginTransaction();
       // Save the student object to the database
       session.persist(s1);
       transaction.commit();

       // Retrieve the student object from the database
       Student s2 = session.get(Student.class, 1);

       session.close();
       sf.close();

       System.out.println(s1);
       System.out.println(s2);
    }
}