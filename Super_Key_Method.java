package Core_Java;
class prime{
	public void Hi() {
		System.out.println("Parent class Super Key");
	}
}
class Prime1 extends prime{
	public void Hi() {
		super.Hi();
		System.out.println("Child class Super Key");
	}
}
public class Super_Key_Method {

	public static void main(String[] args) {
		Prime1 obj=new Prime1();
		obj.Hi();

	}

}

