package net.ukr.ruslana;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
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
		System.out.println("Input Gender: m - man, f - woman");
		char gender = this.validateParam("[a-z]").charAt(0);
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

	public void fileSave() {
		try (PrintWriter pw = new PrintWriter(groupName + ".txt")) {
			for (int i = 0; i < studentArray.length; i++) {
				if (studentArray[i] != null) {
					pw.println(studentArray[i].toString());
				}
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	public void fileRead(String fileName) {
		System.out.println("Read from File");
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String text = " ";
			for (int i = 0; (i < 10) && ((text = br.readLine()) != null); i++) {
				String[] a = text.split("\\s+");
				this.studentArray[i] = new Student(a[0], a[1], Integer.parseInt(a[2]), a[3].charAt(0),
						Integer.parseInt(a[4]), a[5], Integer.parseInt(a[6]));
				System.out.println((i + 1) + ") " + studentArray[i]);
			}
		} catch (IOException e) {
			System.out.println("Error in reading");
		}

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
