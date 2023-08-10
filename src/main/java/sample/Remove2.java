package sample;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove2 {
public static void main(String[] args) {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter id");
	Details2 d=m.find(Details2.class, sc.nextInt());
	if(d!=null)
	{
		t.begin();
		m.remove(d);
		t.commit();
	}
	else
	{
		System.out.println("No data");
	}
}
}
