package Core_Java;

public class Multilevel_Inheritance_Child_Class1 extends  Multilevel_Inheritance_Parent_Class {
	String name="Tomato";
	public void Java(String name,String name2) {
		System.out.println(name);
		System.out.println(name2);
		
	}

	public static void main(String[] args) {
		Multilevel_Inheritance_Child_Class1 obj=new Multilevel_Inheritance_Child_Class1();
		obj.Add();
		System.out.println("Division:"+obj.Div());
		System.out.println(obj.name);
		

	}

}
