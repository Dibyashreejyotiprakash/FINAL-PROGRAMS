package STRING_FINAL;

import java.util.Scanner;

public class Compare_2_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String1..");
		String s1=sc.nextLine();
		System.out.println("Enter a String2..");
		String s2=sc.nextLine();
		
		if(s1.length()==s2.length()){
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    System.out.println("String "+s1+" is not equal to string "+s2);
                    break;
                }
            }
            System.out.println("String "+s1+" is equal to string "+s2);
        }else{
            System.out.println("String "+s1+" is not equal to string "+s2);
        }
	}

}
