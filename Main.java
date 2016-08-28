package net.ukr.geka3;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		boolean exceptionOccur = false;
		Student stOne = new Student("Vasya", "Petechkin", 18, true, "FL-31", 1, "IFF");
		Student stTwo = new Student("Lena", "Zayceva", 18, false, "FL-32", 1, "IFF");
		Student stThree = new Student("Kolya", "Petechkin", 18, true, "FL-32", 1, "IFF");

		Group groupOne = new Group("FL-31");

		try {

			for (int i = 0; i < 3; i++) {
				groupOne.addStudent(stOne);
				groupOne.addStudent(stTwo);
				groupOne.addStudent(stThree);
			}

		} catch (FullGroupException e) {
			exceptionOccur= true;
			//System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(exceptionOccur){
				System.out.println("Exception was but the program is still working");
			}else{
				System.out.println("Exception wasn't and program is working");
			}
			
			
		}
		
		System.out.println(groupOne.getSortedListOfStudents());
		System.out.println();
		//searching student by family
		Student findStudent = groupOne.getStudent("Zayceva");
		
		if(findStudent != null){
			System.out.println("Student was found " + System.lineSeparator() + findStudent.toString());
			
			
		}else{
			System.out.println("Student was not found");
		}
		
		
		System.out.println("it is working!!! :)))");
	}

}
