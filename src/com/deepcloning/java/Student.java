package com.deepcloning.java;

public class Student implements Cloneable {
	int roll;
	String name;
	Address add;

	public Student(int roll, String name, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}

	protected Object clone() throws CloneNotSupportedException {
		Student dummy = (Student) super.clone();
		Address addr = (Address) add.clone();

		dummy.add = addr;
		return dummy;
	}

	
}
