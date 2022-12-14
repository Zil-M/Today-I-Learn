package ch2_09;

public class Student {
	String name;
	int id;
	
	Subject korean;
	Subject math;
	
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSubject(String name , int score) {
		korean.name = name;
		korean.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.name = name;
		math.score = score;
	}
	
	public void showTotalScoreInfo() {
		final int TOTAL_SCORE = korean.score + math.score;
		
		System.out.printf("%s 학생은 총 %d 점이다.\n", name, TOTAL_SCORE);
	}
}