package com.pojo;

import java.io.Serializable;

public class Student implements Serializable , Cloneable {

	private int stuid;
	private String stuname;

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	protected int add(int a, int b) {
		return a + b;
	}

	public Student(int a) {

	}

	public Student() {

	}

}
