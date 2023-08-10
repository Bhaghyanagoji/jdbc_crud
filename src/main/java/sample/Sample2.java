package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Sample2 {
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	Sample1 s1=new Sample1();
	s1.setAge(24);
	s1.setName("bhaghya");
	s1.setAddress("hubli");

	Sample1 s2=new Sample1();
	s2.setAge(19);
	s2.setName("bhavana");
	s2.setAddress("vidyanagar");
	
	Sample1 s3=new Sample1();
	s3.setAge(21);
	s3.setName("abhi");
	s3.setAddress("bengaluru");

	t.begin();
	m.persist(s1);
	m.persist(s2);
	m.persist(s3);
	t.commit();

}
}
