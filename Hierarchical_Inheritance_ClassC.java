package Core_Java;

public class Hierarchical_Inheritance_ClassC extends Hierarchical_Inheritance_ClassA {
	public void core() {
		System.out.println("Selenium");
	}

	public static void main(String[] args) {
		Hierarchical_Inheritance_ClassC obj=new Hierarchical_Inheritance_ClassC();
		obj.Add(45, 15);
		obj.Div();
		obj.core();

	}

}
