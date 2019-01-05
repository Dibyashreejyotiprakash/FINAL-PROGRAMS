package ARRAY_FINAL;

import java.util.HashSet;

public class CommonElement {
	public static void main(String[] args) {

		int a[] = { 2, 6, 7, 8, 9, 1, 4 };
		int b[] = { 2, 8, 4, 11, 15, 17 };
		HashSet st1 = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					st1.add(a[i]);
				}
			}
		}
		System.out.println("Duplicate integer element " + st1);

		String c[] = { "dibya", "vivo", "samsung", "sanio" };
		String d[] = { "dibya", "samsung", "oppo" };
		HashSet st2 = new HashSet<>();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < d.length; j++) {
				if (c[i].equals(d[j])) {
					st2.add(c[i]);
				}
			}
		}
		System.out.println("Duplicate String element " + st2);
	}

}
