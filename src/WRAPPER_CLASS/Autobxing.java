package WRAPPER_CLASS;

public class Autobxing {
	public static void main(String[] args) {
		 
		//Converting primitive to object
		
		int a1=10;
		Integer i1=Integer.valueOf(a1);
		System.out.println(i1);
		
		float a2=10.9f;
		Float f1=Float.valueOf(a2);
		System.out.println(f1);
		
		int a3=Integer.parseInt("11");
		System.out.println(a3);
	}

}
