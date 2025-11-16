package hii.shubham;

import java.util.Arrays;

public class Merge__array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,2,3,0,0,0};
		int [] num2 = {2,5,6};
		int m=3;
		int n=3;
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		
		while(j>=0) {
			if(num1[i]>num2[j]) {
				num1[k--]=num1[i--];
			}else {
				num1[k--]=num2[j--];
				
			}
		}
		System.out.println(Arrays.toString(num1));
	}

}
