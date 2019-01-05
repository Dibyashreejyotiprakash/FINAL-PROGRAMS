package STRING_FINAL;

import java.util.Arrays;
import java.util.Scanner;

public class Sortin_Character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
        String word = sc.nextLine();
        System.out.println("Before sorting word is .."+word);
        char temp;
        char ch[]=word.toCharArray();
        String sortedword;
        for(int i=0;i<ch.length;i++)
        {
        	for(int j=0;j<ch.length;j++)
        	{
        		if(ch[j]>ch[i])
        		{
        			temp=ch[i];
        			ch[i]=ch[j];
        			ch[j]=temp;
        		}
        	}
        }
        System.out.println(Arrays.toString(ch));
        sortedword=new String(ch);
        System.out.println("After sorting word is "+sortedword);
	}

}
