package Core_Java;

public class Default_constractor {
	Default_constractor(){
		System.out.println("Default constractor");
	}
	public void constractor() {
		System.out.println("Java.......");
	}

	public static void main(String[] args) {
		Default_constractor obj=new Default_constractor();
		obj.constractor();

	}

}
