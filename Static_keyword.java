package Core_Java;

public class Static_keyword {
	public static void Add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	static void Mul() {
		int d=23*12;
		System.out.println(d);
	}
	static void Div() {
		int e=35/7;
		System.out.println(e);
	}
	public static void Sub() {
		int x=56-26;
		System.out.println(x);
	}

	public static void main(String[] args) {
//		Static_keyword obj=new Static_keyword();
//		obj.Div();
//		obj.Mul();
//		obj.Add(12,13);
//		obj.Sub();
		Static_keyword.Add(12, 13);
		Static_keyword.Sub();
		Static_keyword.Div();
		Static_keyword.Mul();

	}

}
