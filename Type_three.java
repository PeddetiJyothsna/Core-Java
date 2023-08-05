package Core_Java;

public class Type_three {
	public void Add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void Mul(int i,int j)
	{
		int d=i*j;
		System.out.println(d);
	}
	public void Div(int k,int l)
	{
		int m=k/l;
		System.out.println(m);
	}
	public void Sub(int x,int y)
	{
		int z=x-y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Type_three obj=new Type_three();
		obj.Add(23, 13);
		obj.Sub(25, 11);
		obj.Mul(12, 13);
		obj.Div(58, 16);
		

	}

}
