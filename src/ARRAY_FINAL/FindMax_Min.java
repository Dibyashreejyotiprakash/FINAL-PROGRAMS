package ARRAY_FINAL;

public class FindMax_Min {
	public static void main(String[] args) {
		int[] myArray = new int[] { 1, 3, 8, 5, 7, 90,77};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
		}

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < min) {
				min = myArray[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}


}
