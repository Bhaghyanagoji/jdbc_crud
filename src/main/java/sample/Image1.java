package sample;

import java.io.FileInputStream;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Image1 {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Scanner sc = new Scanner(System.in);
		Image i1 = new Image();
		System.out.println("Enter name");
		i1.setName(sc.next());
		System.out.println("-----------------------------");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter path");
		FileInputStream f = new FileInputStream(sc2.nextLine());
		byte[] b = new byte[f.available()];
		f.read(b);
		i1.setImage(b);
		t.begin();
		m.persist(i1);
		t.commit();
	}
}
