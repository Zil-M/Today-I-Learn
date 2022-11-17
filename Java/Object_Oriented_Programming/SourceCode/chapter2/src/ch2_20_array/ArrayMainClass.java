package ch2_20_array;

public class ArrayMainClass {

	public static void main(String[] args) {
		
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
}
