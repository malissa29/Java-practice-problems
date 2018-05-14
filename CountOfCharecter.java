//package SampleCodes;

import java.util.ArrayList;
import java.util.List;

public class CountOfCharecter {
	
	public static void main(String[] arg){ 
	
	String[] A=new String[]{"a","b","b","c","a","a"};
	int count=0;
	for(int i=0;i<A.length;i++)
	{
		if(A[i]=="a")
		{
			count++;
		}
	}
	System.out.println(count);
	}

}
