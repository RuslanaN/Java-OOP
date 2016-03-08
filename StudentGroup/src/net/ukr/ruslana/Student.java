package net.ukr.ruslana;

public class Student extends Human implements Comparable {
	private int personalId;
	private String department;
	private int course;

	public Student(String surname, String name, int age, boolean gender, int personalId, String department,
			int course) {
		super(surname, name, age, gender);
		this.personalId = personalId;
		this.department = department;
		this.course = course;
	}

	public int getPersonalId() {
		return personalId;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return super.toString() + " " + "Personal ID: " + this.personalId + " " + "Department: " + this.department + " "
				+ "Course: " + this.course;
	}

	@Override
	public int compareTo(Object o) {
		if (o == null) {
			return -1;
		}
		Student anotherStud = (Student) o;
		return this.getSurname().compareTo(anotherStud.getSurname());
	}

}
