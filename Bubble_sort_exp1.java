package Core_Java;

import java.util.Arrays;

public class Bubble_sort_exp1 {

	public static void main(String[] args) {
		int[] a= {4,2,6,8,1,7,3,9,10,5};
		System.out.println("Before sorting:"+Arrays.toString(a));
		int b=a.length;
		for(int i=0;i<b-1;i++) {
			for(int j=0;j<b-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
		
		System.out.println("After sorting:"+Arrays.toString(a));

	}

}
