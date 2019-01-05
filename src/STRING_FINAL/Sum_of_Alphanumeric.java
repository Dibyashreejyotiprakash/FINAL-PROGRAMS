package STRING_FINAL;

import java.util.Scanner;

public class Sum_of_Alphanumeric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.nextLine();
		int count = 0;
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				count = ch[i] - 48 + count;
			}

		}
		System.out.println("Sum of numeric values " + count);
	}

}
