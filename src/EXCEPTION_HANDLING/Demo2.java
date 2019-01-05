package EXCEPTION_HANDLING;

public class Demo2 {
	public static void main(String[] args){
		try{
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
