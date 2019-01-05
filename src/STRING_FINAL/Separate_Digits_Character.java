package STRING_FINAL;

public class Separate_Digits_Character {
	static String letters="";
	static String digits="";
	static void separateDigitCharacter(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				digits=digits+ch[i];
			}else{
				letters=letters+ch[i];
			}
		}
		System.out.println("Letters are "+letters);
		System.out.println("Digits are "+digits);
	}
	public static void main(String[] args) {
		separateDigitCharacter("dibya123");
	}

}
