package basic;

import java.util.Arrays;

public class ReverseArray {
	
	void reverseArray(int a[] , int n) {
		int t;
		for(int i=0;i<n/2;i++) {
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;	
		}
		System.out.println(Arrays.toString(a));	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] demo= {1,2,3,4,5,6};
		new ReverseArray().reverseArray(demo, demo.length);
	}

}
