package STRING_FINAL;

import java.util.Arrays;
import java.util.Scanner;

public class Print_Each_CHar_of_Sentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence..");
		String sentence=sc.nextLine();
		String sentence1=sentence.replace(" ","");
		String ch[]=sentence1.split("");
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
