package STRING_FINAL;

import java.util.Scanner;

public class Lowerto_Upper_Viseversa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String..");
		String word = sc.nextLine();
		char ch[] = word.toCharArray();
		char ch1[];
		String nstr;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i] + 32);
			} else if (ch[i] >= 97 && ch[i] <= 122) {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		nstr = new String(ch);
		System.out.println(nstr);
	}

}
