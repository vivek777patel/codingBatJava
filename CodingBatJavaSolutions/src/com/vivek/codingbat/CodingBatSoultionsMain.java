package com.vivek.codingbat;

import com.vivek.codingbat.ap1.WordsFront;

public class CodingBatSoultionsMain {

	public static void main(String[] args) {
		Dog aDog = new Dog("Rover");
		// we pass the object to foo
		foo(aDog);
		// aDog variable is still pointing to the "Max" dog when foo(...) returns
		System.out.println(aDog.getName().equals("Max")); // true, java passes by value
		System.out.println(aDog.getName().equals("RowlfC")); // false
	}

	public static void foo(Dog d) {
		d.setName("Max"); // true
		// change d inside of foo() to point to a new Dog instance "Fifi"
		d = new Dog("Fifi");
		d.setName("RowlfC"); // true
	}
	
}

class Dog{
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
