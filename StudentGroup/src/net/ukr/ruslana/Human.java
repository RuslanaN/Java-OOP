package net.ukr.ruslana;

public class Human {
	private String surname;
	private String name;
	private int age;
	private boolean gender;

	public Human(String surname, String name, int age, boolean gender) {
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

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Surname: " + this.surname + " " + "Name: " + this.name + " " + "Age: " + this.age + " " + "Gender: "
				+ this.gender;
	}

}
