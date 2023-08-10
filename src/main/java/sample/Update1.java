package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update1 {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		//              class name  and primary key
		Details d=m.find(Details.class, 24);
		if(d!=null)
		{
			t.begin();
			d.setAddress("Vidya_nagar");
			m.merge(d);
			t.commit();
		}
		else
		{
			System.out.println("No data");
		}
	}

}
