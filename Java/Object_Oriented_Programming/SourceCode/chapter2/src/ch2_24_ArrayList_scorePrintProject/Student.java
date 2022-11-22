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
