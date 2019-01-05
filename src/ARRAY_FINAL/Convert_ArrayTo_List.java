package ARRAY_FINAL;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_ArrayTo_List {

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 3, 5, 6, 8, 9 };
		System.out.println("Array is " + Arrays.toString(a));
		

		System.out.println("****************************");

		String[] my_array = new String[] { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));

		System.out.println(list);
	}

}
