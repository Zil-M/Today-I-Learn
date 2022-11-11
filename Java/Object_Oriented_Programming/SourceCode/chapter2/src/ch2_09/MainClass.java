package ch2_09;

public class MainClass {
	public static void main(String[] args) {
		Student user1 = new Student(1, "hong");
		user1.setKoreanSubject("국어", 100);
		user1.setMathSubject("수학", 90);
		
		user1.showTotalScoreInfo();
		
		
		
		Student user2 = new Student(1, "kong");
		user2.setKoreanSubject("국어", 80);
		user2.setMathSubject("수학", 70);
		
		user2.showTotalScoreInfo();
	}

}
