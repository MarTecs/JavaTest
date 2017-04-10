package com.pojo;

public class Student implements Comparable<Student> {
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

	@Override
	public int hashCode() {
		System.out.println("a");
		return stuid;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("b");
		if (obj instanceof Student) {
			if (((Student) (obj)).getStuid() == this.stuid) {
				return true;
			}
		}

		return false;
	}

	@Override
	public int compareTo(Student o) {
		return this.getStuid() - o.stuid;
	}

}
