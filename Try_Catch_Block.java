package Core_Java;

public class Try_Catch_Block {

	public static void main(String[] args) {
		try {
			int a=45/0;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println("This is error of number format");
		}
		finally {
			int b=90-45;
			System.out.println(b);
		}

	}

}
