package Core_Java;

public class Type_two {
	public void Add()
	{
		int a=45;
		int b=23;
		int c=a+b;
		System.out.println(c);
	}
	public void Mul()
	{
		int d=12*13;
		System.out.println(d);
	}
	public void Div()
	{
		int e=300/90;
		System.out.println(e);
	}
	public void Sub() {
		int f=26-13;
		System.out.println(f);
	}

	public static void main(String[] args) {
		Type_two kedhari=new Type_two();
		kedhari.Add();
		kedhari.Div();
		kedhari.Sub();
		kedhari.Mul();
		

	}

}
