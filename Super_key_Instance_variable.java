package Core_Java;
class some{
	String name="John Abraham";
	public void Hi() {
		//System.out.println(name);
		System.out.println("Parent class super key");
		
	}
}
class fields extends some{
	String name="Prabhu";
	public void Hi() {
		super.Hi();
		System.out.println(super.name);
		System.out.println(name);
	}
}

public class Super_key_Instance_variable {

	public static void main(String[] args) {
		fields obj=new fields();
		obj.Hi();

	}

}
