package ch2_10_accessModifierPracticeCode;


/*
 * 접근 제어 지시자 키워드에 따라 외부 클래스에서 접근 가능한 결과를 실습하는 코드
 * private 맴버 변수는 get, set 메서드로 값 읽기, 값 수정 기능 제공
 * 
 * 
 * 
 * 이클립스에서는 Alt+Shift+S(Source) 에서 get, set 메서드 자동 생성 기능을 제공한다
 * get, set 메서드의 이름을 바꾸어도 무방하나, 통상적으로 get,set 이름을 사용한다.
 */


public class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if( month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	// 값이 존재하면 생년월일을 출력하는 메서드
	public void showDate() {
		if(isValid) {
			System.out.printf("생일은 %d 년 %d 월 %d 일 이다.\n", year, month, day);
		}
		else {
			System.out.println("유효하지 않은 날짜");
		}
	}
	

}
