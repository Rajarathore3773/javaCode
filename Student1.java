
public class Student1 {
	private int studentId;
	private String studentName;
	private int studentAge;

	public Student1() {
	super();
	}

	public Student1(int studentId, String studentName, int studentAge) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

	
public void updateStudent(int studentId, String studentName, int studentAge){
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAge = studentAge;
}
}
