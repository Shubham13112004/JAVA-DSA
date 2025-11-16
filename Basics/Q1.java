package tcs.com;

public class Q1 {

	public static void main(String[] args) {
		int [] arr = {0, 1, 2, 3, 4, 5, 6};
		int target = 9;
		int count=0;
		int l=0;
		int r= arr.length-1;
		while(l<r) {
			
			
			int ans = arr[l]+arr[r];
			
			if(target==ans) {
			count++;
			l++;
			r--;
			}
			else if(ans<target) {
				l++;
			}else {
				r--;
			}
		}
		System.out.println(count);

	}

}
