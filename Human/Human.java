package net.ukr.ruslana;

public class Human {
	private String name;
	private String surname;;
	private int age;
	private boolean gender;

	public Human(String name, String surname, int age, boolean gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
		return "Name: " + this.name + " " + "Surname: " + this.surname + " " + "Age: " + this.age + " " + "Gender: "
				+ this.gender;
	}

}
