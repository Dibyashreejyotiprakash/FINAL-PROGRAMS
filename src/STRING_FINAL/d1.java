package STRING_FINAL;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class d1 {
	public static void main(String[] args) {
	
		for(int i=0;i<=10;i++)
		{
		StringBuffer sb=new StringBuffer("dibya");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		System.out.println(sb.append(timestamp));
		
}
	}
}

