package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch1 {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		//              class name  and primary key
		Details d=m.find(Details.class, 24);
		if(d!=null)
		{
			System.out.println(d.getId());
			System.out.println(d.getName());
			System.out.println(d.getAddress());
		}
		else
		{
			System.out.println("No data");
		}
}
}