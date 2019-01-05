package STRING_FINAL;

import java.util.Scanner;

public class Print_ToggleCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String..");
		String inputString=sc.nextLine();
		String result = "";
		for (int i = 0; i < inputString.length(); i++) {
	           char currentChar = inputString.charAt(i);
	           if (Character.isUpperCase(currentChar)) {
	               char currentCharToLowerCase = Character.toLowerCase(currentChar);
	               result = result + currentCharToLowerCase;
	           } else {
	               char currentCharToUpperCase = Character.toUpperCase(currentChar);
	               result = result + currentCharToUpperCase;
	           }
	       }
		System.out.println(result);
	}

}
