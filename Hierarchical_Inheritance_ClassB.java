package Core_Java;

public class Hierarchical_Inheritance_ClassB extends  Hierarchical_Inheritance_ClassA {
	public void java(String name,int id) {
		System.out.println(name);
		System.out.println(id);
	}

	public static void main(String[] args) {
		Hierarchical_Inheritance_ClassB obj=new Hierarchical_Inheritance_ClassB();
		obj.Mul();
		System.out.println("Subtraction:"+obj.Sub());
		obj.java("Papaya", 429);

	}

}
