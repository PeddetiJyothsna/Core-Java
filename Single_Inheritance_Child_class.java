package Core_Java;

public class Single_Inheritance_Child_class extends Single_Inheritance_Parent_Class{
	public void Mul() {
		int c=6*5;
		System.out.println("Multiplication:"+c);
	}
	public void Sub() {
		int d=90-75;
		System.out.println("Subtraction:"+d);
	}
	String emp="Tomato";

	public static void main(String[] args) {
		Single_Inheritance_Child_class obj=new Single_Inheritance_Child_class();
		obj.Add();
		obj.Div();
		System.out.println(obj.name);
		System.out.println(obj.name2);
		obj.Mul();
		obj.Sub();
		System.out.println(obj.emp);

	}

}
