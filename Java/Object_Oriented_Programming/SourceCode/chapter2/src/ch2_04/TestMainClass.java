package ch2_04;

public class TestMainClass {

	public static void main(String[] args) {
		Student testStudent = new Student();
		
		testStudent.studentId = 12345;
		testStudent.setStudentName("tester1");
		testStudent.address = "서울특별시 행복구";
		
		testStudent.showStudentInfo();

		System.out.println(testStudent);
	}
}
