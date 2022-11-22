package ch2_24_ArrayList_scorePrintProject;
import java.util.ArrayList;

public class Student {
	private String name;
	private int id;
	private ArrayList<Subject> subjectList;
	
	Student(String name, int id){
		this.name = name;
		this.id = id;
		this.subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		subjectList.add(new Subject(name, score));
	}
	
	public void showStudentScoreInfo() {
		int totalScore = 0;
		
		for(int i = 0; i < subjectList.size(); i++) {
			System.out.printf("[학생번호: %d] %s의 %s 성적은 %d 점이다.\n", this.id, this.name, subjectList.get(i).name, subjectList.get(i).score);
			totalScore += subjectList.get(i).score;
		}
		
		System.out.printf("총점은 %d 점이다.\n", totalScore);
		System.out.printf("---------------------------- \n");
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