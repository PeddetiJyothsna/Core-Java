package Core_Java;

public class Method_Overriding_Child_Class extends Method_Overriding_Parent_Class {
	public void java(String name,int id) {
		System.out.println(name);
		System.out.println(id);
	}
	public void java(String name,String name2) {
		System.out.println(name);
		System.out.println(name2);
	}
	public void java(int age,String name5) {
		System.out.println(age);
		System.out.println(name5);
	}

	public static void main(String[] args) {
		Method_Overriding_Child_Class obj=new Method_Overriding_Child_Class();
		obj.java("ABCD", 1123);
		obj.java("DEFG", "KLMN");
		obj.java(4290, "WXYZ");

	}

}
