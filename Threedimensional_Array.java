package Core_Java;

public class Threedimensional_Array {

	public static void main(String[] args) {
		int[][] a=new int[3][3];
		a[0][0]=6;
		a[0][1]=9;
		a[0][2]=3;
		a[1][0]=1;
		a[1][1]=12;
		a[1][2]=5;
		a[2][0]=4;
		a[2][1]=8;
		a[2][2]=7;
		System.out.println("The value of Array is..:"+a[1][2]);
		System.out.println("The data of Array is..:"+a[1][0]);
		System.out.println("The data of Array is..:"+a[2][0]);
		System.out.println("The data of Array is..:"+a[0][0]);
		System.out.println("The data of Array is..:"+a[1][1]);
		System.out.println("The data of Array is..:"+a[1][2]);

	}

}
