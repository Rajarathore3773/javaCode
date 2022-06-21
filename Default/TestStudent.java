import java.util.Scanner;

public class TestStudent {
	public static int availableStudent(Student[] s, int id) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}

	public static void updateStudent(Student[] s, int index, String name) {

		s[index].setName(name);
	}

	public static void deleteStudent(Student[] s, int index) {
		s[index] = null;
	}

	public static String returnName(Student[] s, int index) {
		return s[index].getName();
	}

	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		s[0] = new Student(101, "Raja");
		s[1] = new Student(102, "Mohit");
		s[2] = new Student(103, "Gajju");
		int index = availableStudent(s, 102);
		
		try {
			if (index == -1) {
				throw new Exception("Student not found ");
			}else {
				System.out.println("index number :" + index + " " + returnName(s, index));
				// 2 index vale student ko modify karna h
				// System.out.println("Before Updation "+returnName(s,index));

				updateStudent(s, index, "Rohit Singh");
				System.out.println("After Updation " + returnName(s, index));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		

		

	}
}
