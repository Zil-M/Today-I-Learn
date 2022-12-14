package ch2_24_ArrayList_scorePrintProject;

public class ScorePrintMainClass {

	public static void main(String[] args) {
		Student student1 = new Student("Student1", 1000);
		
		student1.addSubject("Korean", 100);
		student1.addSubject("Math", 50);
		student1.showStudentScoreInfo();
		
		
		Student student2 = new Student("Student2", 1000);
		
		student2.addSubject("Korean", 70);
		student2.addSubject("Math", 85);
		student2.addSubject("English", 100);
		student2.showStudentScoreInfo();
	}
}

/* 실행 결과
 * 
 * [학생번호: 1000] Student1의 Korean 성적은 100 점이다.
 * [학생번호: 1000] Student1의 Math 성적은 50 점이다.
 * 총점은 150 점이다.
 * ---------------------------- 
 * [학생번호: 1000] Student2의 Korean 성적은 70 점이다.
 * [학생번호: 1000] Student2의 Math 성적은 85 점이다.
 * [학생번호: 1000] Student2의 English 성적은 100 점이다.
 * 총점은 255 점이다.
 * ---------------------------- 
 */
