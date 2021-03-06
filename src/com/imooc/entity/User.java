package com.imooc.entity;

import java.util.List;

public class User {
	private String username;
	private String password;
	private List<String> booklist;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<String> booklist) {
		this.booklist = booklist;
	}
}
