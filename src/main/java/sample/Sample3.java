package sample;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Sample3 {
	@Id
private int id;
	@Column(length=50)//if we want to change the database column give ->@Column(length=50,name="sample")
private String name;
	@Version
private int count;
@CreationTimestamp
private Timestamp itime;
@UpdateTimestamp
private Timestamp utime;
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
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public Timestamp getItime() {
	return itime;
}
public void setItime(Timestamp itime) {
	this.itime = itime;
}
public Timestamp getUtime() {
	return utime;
}
public void setUtime(Timestamp utime) {
	this.utime = utime;
}



}
