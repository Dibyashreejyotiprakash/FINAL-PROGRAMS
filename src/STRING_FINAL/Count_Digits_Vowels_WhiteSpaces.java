package STRING_FINAL;

public class Count_Digits_Vowels_WhiteSpaces {
	public static void main(String[] args) {
		String s="dibya123 shree";
		char ch[]=s.toCharArray();
		int vowels=0;
		int digit=0;
		int spaces=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				vowels++;
			}else if(Character.isDigit(ch[i]))
			{
				digit++;
			}else if(Character.isWhitespace(ch[i]))
			{
				spaces++;
			}
		}
		System.out.println("Number of vowels are "+vowels);
		System.out.println("Number of digit are "+digit);
		System.out.println("Number of white spaces are "+spaces);
	}

}
