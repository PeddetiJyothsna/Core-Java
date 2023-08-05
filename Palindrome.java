package Core_Java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=sc.nextInt();
		int rev=0;
		int con=a;
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if(rev==con) {
			System.out.println("Palindrome...");
		}
		else {
			System.out.println("Not a palindrome..");
		}
	}

}
