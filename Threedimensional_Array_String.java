package Core_Java;

public class Threedimensional_Array_String {

	public static void main(String[] args) {
		String[][] a=new String[3][3];
		a[0][0]="Java";
		a[0][1]="Selenium";
		a[0][2]="MySQL";
		a[1][0]="HTML";
		a[1][1]="CSS";
		a[1][2]="Python";
		a[2][0]="Manual Testing";
		a[2][1]="Java script";
		a[2][2]="Dot NET";
		System.out.println("The data of Array is..:"+a[2][0]);
		System.out.println("The data of Array is..:"+a[1][1]);
		System.out.println("The data of Array is..:"+a[2][2]);
		System.out.println("The data of Array is..:"+a[0][2]);
		System.out.println("The data of Array is..:"+a[0][1]);
		System.out.println("The data of Array is..:"+a[2][1]);

	}

}
