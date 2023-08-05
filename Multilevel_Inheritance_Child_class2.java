package Core_Java;

public class Multilevel_Inheritance_Child_class2 extends  Multilevel_Inheritance_Child_Class1 {
	String emp="Gadhalakonda ganesh";
	public void core(){
		System.out.println("Ganesh from Gadhalakonda");
	}

	public static void main(String[] args) {
		Multilevel_Inheritance_Child_class2 obj=new Multilevel_Inheritance_Child_class2();
		obj.Java("Juice", "water");
		obj.Mul();
		obj.Sub();
		obj.core();
		System.out.println(obj.emp);

	}

}
