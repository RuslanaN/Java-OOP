package net.ukr.ruslana;

import java.util.Arrays;
import java.util.Scanner;

public class Group {
	private Student[] studentArray = new Student[10];
	private String groupName;

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student student) throws GroupFullException {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] == null) {
				studentArray[i] = student;
				// System.out.println("Student add!");
				return;
			}
		}
		throw new GroupFullException();
	}

	public void findStudent(String surname) {
		int count = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				if (studentArray[i].getSurname().equals(surname)) {
					count++;
					System.out.println(studentArray[i].toString());
				}
			}
		}
		if (count == 0) {
			System.out.println("Student not found!");
		}
	}

	public String validateParam(String validParam) {
		Scanner sc = new Scanner(System.in);
		String input;
		for (;;) {
			input = sc.nextLine();
			if (input.matches(validParam)) {
				break;
			} else {
				System.out.println("Inalid param! Input again");
			}
		}
		return input;
	}

	public void interactiveAddStudent() throws GroupFullException {
		System.out.println("Input info of Student");
		System.out.println("Input Surname");
		String surname = this.validateParam("[A-Z][a-z]+");
		System.out.println("Input Name");
		String name = this.validateParam("[A-Z][a-z]+");
		System.out.println("Input age");
		int age = Integer.parseInt(this.validateParam("[1-5][0-9]"));
		System.out.println("Input Gender: true - man, false - woman");
		boolean gender = Boolean.parseBoolean(this.validateParam("[a-z]+"));
		System.out.println("Input Personal ID");
		int personalId = Integer.parseInt(this.validateParam("[1-9][0-9]{4}"));
		System.out.println("Input Department");
		String department = this.validateParam("[A-Z][aA-zZ]+");
		System.out.println("Input Course");
		int course = Integer.parseInt(this.validateParam("[1-5]"));
		this.addStudent(new Student(surname, name, age, gender, personalId, department, course));
	}

	public void sort() {
		int result = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				result++;
			}
		}
		Arrays.sort(studentArray, 0, result);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group: " + groupName + "\n");
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				sb.append((i + 1) + ") " + studentArray[i] + "\n");
			} else {
				sb.append((i + 1) + ") " + "free" + "\n");
			}
		}
		return sb.toString();
	}

}
