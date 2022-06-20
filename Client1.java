import java.util.Scanner;

public class Client1 {
	
	
	public static void main(String[] args) {
		Student1 student[] = new Student1[5];
		int studentId = 0, studentAge = 0, counter = 0;
		String studentName = null, enteredValue = null;
		do {
			System.out.println("Welcome to Student Managment Application");
			System.out.println(" 1 : Inserting Student");
			System.out.println(" 2 : Display all students");
			System.out.println(" 3 : Update  students");
			System.out.println("Please enter your choice");

			Scanner scanner = new Scanner(System.in);

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please enter student Id");
				studentId = scanner.nextInt();

				System.out.println("Please enter student Name");
				studentName = scanner.next();

				System.out.println("Please enter student Age");
				studentAge = scanner.nextInt();
				Student1 newStudent = new Student1(studentId, studentName, studentAge);
				student[counter++] = newStudent;
				break;
			case 2:
				for (int i = 0; i <= student.length; i++) {
					if (student[i] == null) {
						break;
					} else {
						System.out.println(student[i]);
					}
				}
				break;
			case 3:
				System.out.println("Enter the student id which you want to update :");
				int x=scanner.nextInt();
				System.out.println("currently Value present for the given student id:");
				for(int i=0;i<student.length;i++) {
					if(student[i]==null)
					continue;
					else if(student[i].getStudentId()==x) {
						System.out.println("Name : "+ student[i].getStudentName());
						System.out.println("Age : "+ student[i].getStudentAge());
					
					System.out.println("Enter the new values :");
					System.out.println("Name : ");
					student[i].setStudentName(scanner.next());
					System.out.println("Age : ");
					student[i].setStudentAge(scanner.nextInt());
					
					System.out.println("Updated Student Details:");
					System.out.println(student[i].getStudentId() +" " +student[i].getStudentName() +" "+student[i].getStudentAge() +" ");
					}
				}
				break;
			}
			System.out.println("Do you want to continue (y/n)");
			enteredValue = scanner.next();
		} while (enteredValue.equalsIgnoreCase("y"));
		System.out.println("Thank you for using Student Managment Application !!!!");
		
		
		
	}
}
