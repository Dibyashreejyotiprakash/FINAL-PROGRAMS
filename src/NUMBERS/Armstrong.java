package NUMBERS;

public class Armstrong {
	public static void main(String[] args) {

		int num = 153;
		int arms = 0;
		int temp = num;

		while (num != 0) {
			int rem = num % 10;
			arms = arms + rem * rem * rem;
			num = num / 10;
		}
		System.out.println(arms);
		if (arms == temp) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number..");
		}
	}

}
