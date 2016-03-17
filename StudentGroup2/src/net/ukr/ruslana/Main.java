package net.ukr.ruslana;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group = new Group("CS07");
		Student stud1 = new Student("Ivanov", "Ivan", 20, 'm', 12337, "ComputerScience", 3);
		Student stud2 = new Student("Borysenko", "Andrey", 21, 'm', 12338, "ComputerScience", 3);
		Student stud3 = new Student("Ivashchenko", "Sergey", 20, 'm', 12339, "ComputerScience", 3);
		Student stud4 = new Student("Skvortsova", "Marina", 21, 'f', 12340, "ComputerScience", 3);
		Student stud5 = new Student("Onyshchenko", "Volodymyr", 20, 'm', 12341, "ComputerScience", 3);
		Student stud6 = new Student("Stetsenko ", "Dmytro", 19, 'm', 12342, "ComputerScience", 3);
		Student stud7 = new Student("Kovalenko", "Olena", 20, 'f', 12343, "ComputerScience", 3);
		Student stud8 = new Student("Yaroshenko", "Oleksii", 21, 'm', 12344, "ComputerScience", 3);
		Student stud9 = new Student("Khmelnitsky", "Eugen", 20, 'm', 12345, "ComputerScience", 3);
		Student stud10 = new Student("Antonova", "Anna", 19, 'f', 12346, "ComputerScience", 3);
		//Student stud11 = new Student("Petrov", "Petr", 21, 'm', 12347, "ComputerScience", 3);

		try {
			group.addStudent(stud1);
			group.addStudent(stud2);
			group.addStudent(stud3);
			group.addStudent(stud4);
			group.addStudent(stud5);
			group.addStudent(stud6);
			group.addStudent(stud7);
			group.addStudent(stud8);
			group.addStudent(stud9);
			group.addStudent(stud10);
			//group.addStudent(stud11);
		} catch (GroupFullException e) {
			System.out.println(e.toString());
		}

		System.out.println();
		System.out.println(group);
		System.out.println();

		try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
			OOS.writeObject(group);
		} catch (IOException e) {
			System.out.println("ERROR save group !!!");
		}
		
		Group groupN = null;
		try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("file.txt"))) {
			groupN = (Group) OIS.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("ERROR load group !!!");
		}
		System.out.println();
		System.out.println("Import Group");
		System.out.println(groupN);

		group.findStudent("Antonova");
		group.findStudent("Kovalenko");
		group.findStudent("Petrov");
		System.out.println();

		/*try {
			group.interactiveAddStudent();
		} catch (GroupFullException e) {
			System.out.println("Invalid param!");
		}*/
		
		group.sort();
		System.out.println("Group Students after sort");
		System.out.println(group);

		group.fileSave();
		group.fileRead("CS07.txt");
	}

}
