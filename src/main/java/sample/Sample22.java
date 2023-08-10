package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Sample22 {
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	Sample11 s1=new Sample11();
	s1.setAge(19);
	s1.setName("Abhi");
	s1.setSalary(23686);
	
	Sample11 s2=new Sample11();
	s2.setAge(24);
	s2.setName("Bhaghya");
	s2.setSalary(64876);
	
	t.begin();
	m.persist(s1);
	m.persist(s2);
	t.commit();
}
}
