package ch2_22_N_Array;

public class NArrayMainClass {

	public static void main(String[] args) {
		int[][] twoChanelArray = { { 1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };
		int i, j;
		
		
		for(i =0; i<twoChanelArray.length; i++) {
			
			for(j=0; j<twoChanelArray[i].length; j++) {
				System.out.print(twoChanelArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
