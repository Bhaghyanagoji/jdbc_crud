package sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sample11 {
	@Id
private int age;
private String name;
private double salary;


public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}