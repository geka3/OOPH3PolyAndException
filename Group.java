package net.ukr.geka3;

public class Group {
	String name;

	Student[] array = new Student[10];

	public Group(String name) {
		super();
		this.name = name;
	}

	public void addStudent(Student std) throws FullGroupException {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = std;
				System.out.println(std.name + " is added to group " + this.name);
				return;
			}
		}
		throw new FullGroupException("Group " + name + " is full Exception for " + std.name);
	}

	public String getSortedListOfStudents(){
		StringBuilder studList = new StringBuilder();
		SortStudentsArrya(array);
		for (Student student : array) {
			if(student != null){
				studList.append(student.surName + " " + student.name + System.lineSeparator());
			}
			
		}
		return studList.toString();
	}
	
	
	static public void SortStudentsArrya(Student[] stdArray) {
		Student temp = null;
		for (int i = 0; i < stdArray.length; i++) {
			for (int j = i; j < stdArray.length; j++) {
				if(stdArray[i] == null){
					temp = stdArray[i];
					 stdArray[i] = stdArray[j];
					 stdArray[j] = temp;
				}
				else if(stdArray[j] == null){
				}
				
				else if ((stdArray[i].surName + stdArray[i].name)
						.compareToIgnoreCase(stdArray[j].surName + stdArray[j].name) > 0) {
					 temp = stdArray[i];
					 stdArray[i] = stdArray[j];
					 stdArray[j] = temp;
				}
				
			}
		}
		
		
	}
	public Student getStudent(String surName){
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null && array[i].surName.equals(surName)){
				return array[i];
			}
		}
		return null;
	}

}
