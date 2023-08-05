package Core_Java;

import java.util.Arrays;
import java.util.Collections;

public class Bubble_sort {

	public static void main(String[] args) {
		int[] a= {4,8,6,1,7,2,3,9,10,5};
		System.out.println("Before sorting:"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After sorting:"+Arrays.toString(a));

	}

}
