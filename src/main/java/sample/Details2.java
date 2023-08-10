package sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details2 {
	@Id
private int id;
	@Column(nullable=false,unique=true)//nullable->not null
private String name;
	@Column(unique=true,length=100)
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
@Override
public String toString() {
	return "Details2 [id=" + id + ", name=" + name + ", address=" + address + "]";
}


}
