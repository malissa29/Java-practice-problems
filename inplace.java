//package SampleCodes;

import java.util.ArrayList;
import java.util.List;


public class inplace {
	
	public static void main (String [] args)
	{
		String S="madam";
		int i;
		int j= S.length()-1;
		for (i=0;i<=S.length()/2;i++)
		{
			if(S.charAt(i)==S.charAt(j))
			{
				j--;
			}
			else
			{
			break; 
			}
		}
		
		if(i == S.length()/2 + 1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
