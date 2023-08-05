package Core_Java;

public class Method_Overloading {
	public void java(int id,String name) {
		System.out.println(id);
		System.out.println(name);
	}
	public void selenium(String name1,String name2) {
		System.out.println(name1);
		System.out.println(name2);
	}

	public static void main(String[] args) {
		Method_Overloading obj=new Method_Overloading();
		obj.java(29, "Abcd");
		obj.selenium("Klmn", "Mnop");

	}

}
