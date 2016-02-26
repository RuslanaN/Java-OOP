package net.ukr.ruslana;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group = new Group("CS07");
		
		Student stud1 = new Student("Ivan", "Ivanov", 20, true, 12337, "Computer Science", 3);
		Student stud2 = new Student("Andrey", "Borysenko", 21, true, 12338, "Computer Science", 3);
		Student stud3 = new Student("Sergey", "Ivashchenko", 20, true, 12339, "Computer Science", 3);
		Student stud4 = new Student("Marina", "Skvortsova", 19, false, 12340, "Computer Science", 3);
		Student stud5 = new Student("Volodymyr", "Onyshchenko", 20, true, 12341, "Computer Science", 3);
		Student stud6 = new Student("Dmytro ", "Stetsenko ", 19, true, 12342, "Computer Science", 3);
		Student stud7 = new Student("Olena", "Kovalenko", 20, false, 12343, "Computer Science", 3);
		Student stud8 = new Student("Oleksii ", "Yaroshenko", 21, true, 12344, "Computer Science", 3);
		Student stud9 = new Student("Ivan", "Ivanov", 20, true, 12345, "Computer Science", 3);
		Student stud10 = new Student("Anna", "Antonova", 19, false, 12346, "Computer Science", 3);
		Student stud11 = new Student("Petr", "Petrov", 20, true, 12347, "Computer Science", 3);
		
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
			group.addStudent(stud11);
		} catch (GroupFullException e) {
			System.out.println(e.toString());
		}

		try {
			group.findStudent("Antonova");
			group.findStudent("Kovalenko");
			group.findStudent("Petrov");
		} catch (StudentNotFoundException e) {
			System.out.println(e.toString());
		}
	}

}
