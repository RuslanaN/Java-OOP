package net.ukr.ruslana;

public class Cat {
	private String name;
	private boolean gender;
	private int age;
	private int power;
	private double weight;

	public Cat(String name, boolean gender, int age, int power, double weight) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.power = power;
		this.weight = weight;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void meow() {
		System.out.println("MEOW!");
	}

	public void fight(Cat anotherCat) {
		if (gender == false || anotherCat.gender == false) {
			System.out.println("Fight is impossible!!!");
			return;
		}
		if (age + power + weight == anotherCat.age + anotherCat.power + anotherCat.weight) {
			if (age < anotherCat.age) {
				System.out.println("Win " + this.name + "!");
			} else {
				System.out.println("Win " + anotherCat.name + "!");
			}
		}
		if (age + power + weight > anotherCat.age + anotherCat.power + anotherCat.weight) {
			System.out.println("Win " + this.name + "!");
		}
		if (age + power + weight > anotherCat.age + anotherCat.power + anotherCat.weight) {
			System.out.println("Win " + anotherCat.name + "!");
		}
	}

	public void print() {
		System.out.println("Name " + name);
		System.out.println("Gender " + gender);
		System.out.println("Age " + age);
		System.out.println("Power " + power);
		System.out.println("Weight " + weight);
	}
}
