package ch2_04;

public class Student {
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.printf("%d, %s, %s \n", studentId, studentName, address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
