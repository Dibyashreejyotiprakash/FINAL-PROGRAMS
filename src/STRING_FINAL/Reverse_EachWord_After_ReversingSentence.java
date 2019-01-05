package STRING_FINAL;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_EachWord_After_ReversingSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Senetence..");
		String sentence=sc.nextLine();
		String words[]=sentence.split("\\s");
		String reversesentence="";
		for(int i=words.length-1;i>=0;i--)
		{
			reversesentence=reversesentence+words[i]+" ";
		}
		System.out.println(reversesentence);
		String words1[]=reversesentence.split("\\s");
		String requiredsentence="";
		System.out.println(Arrays.toString(words1));
		for(int i=0;i<words1.length;i++)
		{
			String word=words1[i];
			String newword="";
			char ch[]=word.toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				newword=newword+ch[j];
			}
			requiredsentence=requiredsentence+newword+" ";
		}
		System.out.println(requiredsentence);
}

}
