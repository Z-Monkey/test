package com.test.domain;

public class User {
	private int id;
	private String name;
	private String address;
	//分支dev完成User的set方法
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//分支rel完成User的get方法
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
}
