package Core_Java;
class poly{
	poly(){
		System.out.println("Parent class");
	}
}
class many extends poly{
	many(){
		super();
		System.out.println("Child class");
	}
}

public class Super_key_Constructor {

	public static void main(String[] args) {
		many obj=new many();
		
		

	}

}
