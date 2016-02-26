package net.ukr.ruslana;

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
				System.out.println("Student add!");
				return;
			}
		}
		throw new GroupFullException();
	}

	public void findStudent(String surname) throws StudentNotFoundException {
		for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] != null && studentArray[i].getSurname() == surname) {
                System.out.println(studentArray[i].toString());
                return;
            }
        }
		throw new StudentNotFoundException();
	}
	
}
