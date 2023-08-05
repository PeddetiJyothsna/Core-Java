package Core_Java;

import java.util.Scanner;

public class Prime_numbers_range {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Min value");
		int Min=sc.nextInt();
		System.out.println("Enter Max value");
		int Max=sc.nextInt();
		for( i=Min;i<=Max;i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.println("The value is:"+j+"");
			}
		}
		

	}

}
