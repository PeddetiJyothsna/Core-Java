package Core_Java;
abstract class julio
{
	abstract void java();
	abstract void forms();
}
class dumro{
	public void java() {
		System.out.println("Selenium");
	}
}
class jijili extends dumro{
	public void forms() {
		System.out.println("Core_Java");
	}
}
public class Absraction {

	public static void main(String[] args) {
		jijili obj=new jijili();
		obj.java();
		obj.forms();

	}

}
