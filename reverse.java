//package SampleCodes;

import java.util.ArrayList;
import java.util.List;

public class reverse {
	
	public static void main (String[] args)
	{
		String S= "madam";
		String R="";
		for (int i=S.length()-1; i>=0;i--)
		{
			R = R + S.charAt(i);
		}
		System.out.println(R);
		
		if (S.equals(R)) {
			System.out.println("Palindrome");
			}
		else 
		{
			System.out.println("Not a Palindrome");
		}
	}

}
