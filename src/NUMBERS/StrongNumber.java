package NUMBERS;

public class StrongNumber {
	public static void main(String[] args) {
		int num = 145;
		int temp=num;
		int rem;
		int sum = 0;
		int fact;
		while (num != 0) {
			rem = num % 10;
			System.out.println(rem);
			fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;

			}
			System.out.println("Factorials are.." + fact);
			num = num / 10;
			sum = sum + fact;

		}

		System.out.println("Sum of facts is " + sum);
		
		if(temp==sum)
		{
			System.out.println("Strong Number");
		}else{
			System.out.println("Not Strong");
		}

	}

}
