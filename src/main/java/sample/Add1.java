package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Add1 {
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	Details d1=new Details();
	d1.setId(19);
	d1.setName("Bhavana");
	d1.setAddress("Hubli");
	
	Details d2=new Details();
	d2.setId(20);
	d2.setName("Abhi");
	d2.setAddress("Bengaluru");
	
	Details d3=new Details();
	d3.setId(24);
	d3.setName("Bhaghya");
	d3.setAddress("belgavi");
	
	Details d4=new Details();
	d4.setId(55);
	d4.setName("Veeru");
	d4.setAddress("Davangere");
	
	Details d5=new Details();
	d5.setId(12);
	d5.setName("bhavya");
	d5.setAddress("mysore");
	
	t.begin();
	m.persist(d1);
	m.persist(d2);
	m.persist(d3);
	m.persist(d4);
	m.persist(d5);
	t.commit();
}
}
