package STRING_FINAL;

import java.util.Scanner;

public class Count_CharacterofEach_Word_inSentence {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence ..");
		String sentence=sc.nextLine();
		
		String words[]=sentence.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			char ch[]=word.toCharArray();
			int count=0;
			for(int j=0;j<word.length();j++)
			{
				if(ch[j]>=65 && ch[j]<=90 || ch[j]>=97 && ch[j]<=122 || ch[i]>=48 && ch[i]<=57)
				{
					count++;
				}
			}
			System.out.println("In "+words[i]+" characters  present "+ count );
		}
	}
	

}
