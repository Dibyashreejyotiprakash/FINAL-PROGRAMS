package NUMBERS;

public class PerfectNumber {

	public static void main(String[] args) {
		/*
		 * Def:
             Perfect number, a positive integer that is equal to the sum of its proper divisors. 
             The smallest perfect number is 6, which is the sum of 1, 2, and 3. 
		 */
		int num = 6;
		int temp = num;
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Multiple is " + i);
				sum = sum + i;
			}
		}
		System.out.println("Sum of multiples is " + sum);
		if (sum == temp) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not Perfect number");
		}
	}
}
