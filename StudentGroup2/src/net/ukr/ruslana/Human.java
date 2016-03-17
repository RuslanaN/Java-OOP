package net.ukr.ruslana;

import java.io.Serializable;

public class Human implements Serializable {
	private static final long  serialVersionUID = 1L;
	private String surname;
	private String name;
	private int age;
	private char gender;
	public Human(String surname, String name, int age, char gender) {
		super();
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		String pr = String.format("%-15s\t%-15s\t%d\t%s", this.surname, this.name, this.age, this.gender);
		return pr;
	}
	
}
