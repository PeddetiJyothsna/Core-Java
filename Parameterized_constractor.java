package Core_Java;

public class Parameterized_constractor {
	static String name;
	static int id;
	
	Parameterized_constractor(String name1,int ids){
		//this.name=name1;
		//this.id=ids;
	}
	void constractor() {
		System.out.println("Parameterized_constractor");
	}

	public static void main(String[] args) {
		Parameterized_constractor obj=new Parameterized_constractor("Varman",24);
		obj.constractor();

	}

}
