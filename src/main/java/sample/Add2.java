package sample;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Add2 {
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	Scanner sc=new Scanner(System.in);
	
	Details2 d2=new Details2();
	//System.out.println(d2);//will print object address
	System.out.println("Enter id");
	d2.setId(sc.nextInt());
	System.out.println("Enter name");
	d2.setName(sc.next());
	System.out.println("Enter address");
	d2.setAddress(sc.next());
	
	t.begin();
	m.persist(d2);
	t.commit();
	
	
	
	
	
	
	
	
//	 Details2 d=m.find(Details2.class, 1);
//	 System.out.println(d);
//	when override toString() this will print example=id=1
}
}
