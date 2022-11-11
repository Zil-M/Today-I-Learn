package ch2_03;

// class한 함수 정의 예제 코드
public class FuntionTest {
	
	// 접근 제어자 static 반환값 함수이름 (매개변수)
	public static int addNum(int firstNumber, int secondNumber) {
		int result;
		result = firstNumber + secondNumber;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 20;
		
		System.out.println(addNum(firstNumber, secondNumber));
		sayHello("Hello Java Wrold!");
		System.out.println(calcSum());
	}

}
