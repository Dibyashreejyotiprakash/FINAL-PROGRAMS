package STRING_FINAL;

import java.util.Scanner;

public class Print_Alternate_Char_InUpper {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String name = sc.nextLine();
        String result = "";
        char ch[]=name.toCharArray();
        String uper="";
        String lower="";
        for(int i=0;i<name.length();i++)
        {
        	if(ch[i]%2==0)
        	{
        		ch[i]=(char)(ch[i]-32);
        		
        	}
        	
        }
    }

}

