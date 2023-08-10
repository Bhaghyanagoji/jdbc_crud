package sample;

import java.io.FileOutputStream;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Image2 {
public static void main(String[] args) throws Exception {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id");
	Image i=m.find(Image.class, sc.nextInt());
	System.out.println(i.getId());
	System.out.println(i.getName());
	System.out.println("Enter path");
	FileOutputStream f=new FileOutputStream(sc.next());
	f.write(i.getImage());
	System.out.println("Fetched....");
}
}
