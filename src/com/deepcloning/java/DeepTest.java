package com.deepcloning.java;

public class DeepTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("Pune", "India", 123);
		Student s1 = new Student(786, "Swapnil", add);
		
		System.out.println("before clonning S1: " + s1);
		System.out.println("***********************************************************");
		Student s2 = (Student) s1.clone();
		
		s2.add.city = "Mumbai";
		s2.add.country = "Russia";
		s2.add.pin = 456;
		
		System.out.println("After clonning S2: " + s2);
		System.out.println("***********************************************************");
		
		System.out.println("Hashcode of s1:  "+s1.hashCode() + "    Hashcode of address1: "+ s1.add.hashCode());
		System.out.println("Hashcode of s2:  "+s2.hashCode() + "    Hashcode of address2: "+ s2.add.hashCode());

	}

}
