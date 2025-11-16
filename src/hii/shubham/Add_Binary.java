package hii.shubham;
import java.util.*;
import java.math.BigInteger;
public class Add_Binary {
	

	public static void main(String[] args) {
		String a = "1010";
		String b = "111";
		
		BigInteger a1 = new BigInteger(a,2);
		BigInteger a2 = new BigInteger(b,2);
		
		BigInteger sum = a1.add(a2);
		
		System.out.println(sum.toString(2));
		

	}

}
