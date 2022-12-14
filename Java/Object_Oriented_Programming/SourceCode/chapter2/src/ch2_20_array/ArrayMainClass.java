package ch2_20_array;

public class ArrayMainClass {
	
	public static void sumfuntion() {
		// 1~10 총합 구하기	
		int[] arr = new int[10];
		int total = 0;
		
		for(int i=0, num=1; i < arr.length; i++, num++) {
			arr[i] = num;
		}
		
		for(int i=0; i < arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println(total);
	}
	
	public static void dArrayTest() {
		double[] dArr = new double[5];
		double total = 1;
		
		dArr[0] = 1.0;  
		dArr[1] = 2.0; 
		dArr[2] = 3.0; 
				
		for(int i = 0; i< dArr.length; i++) {
			total *= dArr[i];
		}
				
		System.out.println(total);
	}
	
	public static void dArrayCountTest() {
		double[] dArr = new double[5];
		double total = 1;
		int count = 0;
		
		dArr[0] = 1.0;  count++;
		dArr[1] = 2.0;  count++;
		dArr[2] = 3.0;  count++;
				
		for(int i = 0; i< count; i++) {
			total *= dArr[i];
		}
				
		System.out.println(total);
	}
	
	public static void CharArrayTest() {

		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpahbets.length; i++) {
			
			alpahbets[i] = ch++;
		}
		
		for(char alpha : alpahbets) {
			System.out.println(alpha +","+ (int)alpha);
		}
	}

	public static void main(String[] args) {
		
		// 1~10 총합 구하기	
		// sumfuntion();
		
		// array length 기능 에러 재현 코드
		//dArrayTest();
		
		// array lenght 에러에서 count 코드 추가 코드
		//dArrayCountTest();
		
		CharArrayTest();
	}
	
	
}
