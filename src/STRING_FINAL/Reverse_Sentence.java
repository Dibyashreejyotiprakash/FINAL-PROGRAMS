package STRING_FINAL;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Sentence {
	
public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Sentence..");
	String sentence=sc.nextLine();
	StringBuffer sb=new StringBuffer();
	String words[]=sentence.split("\\s");
	System.out.println(Arrays.toString(words));
	for(int i=words.length-1;i>=0;i--)
	{
		sb.append(words[i]+" ");
	}
	System.out.println(sb);
	}

}
