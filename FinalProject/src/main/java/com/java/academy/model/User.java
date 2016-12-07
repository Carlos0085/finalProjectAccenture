package com.java.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "USERNAME")
	String username;
	
	@Column(name = "HOBBY")
	String hobby;
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", hobbies=" + hobby + "]";
	}
	
	
	public User(){}
	
	public User(String username, int id, String hobby){
		this.username=username;
		this.id=id;
		this.hobby=hobby;
	};
	
	
//	public User(String username) {
//		super();
//		this.username = username;
//	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHobbies() {
		return hobby;
	}
	public void setHobbies(String hobby) {
		this.hobby=hobby;
	}
	
	

}
