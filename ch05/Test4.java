package ch05;

public class Test4 {

	public static void main(String[] args) {
		// 다차원 Array
		int [][] intArray1 = { {1,2,3},{4,5},{7},{10,11,12,13,14} };
		int [] intArray2[] = { {1,2,3},{4,5},{7},{10,11,12,13,14} };
		int intArray3[][] = { {1,2,3},{4,5},{7},{10,11,12,13,14} };
		
		int[][] intArray4 = new int [4][];
		intArray4[0] = new int[] {1,2,3};
		intArray4[1] = new int[2];
		//...
		intArray4[1][0]=4;
		intArray4[1][1]=5;
		//...
		intArray4[3] = new int[5]; //5개 들어갈 공간을 new로 할당해줘야 됨.
		for (int i = 0, j = 10; i < intArray4[3].length && j <= 14; i++, j++) {
			intArray4[3][i] = j;
			
		}

	}
}

