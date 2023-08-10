package sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sample1 {
	@Id
private int age;
private String name;
private String address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
