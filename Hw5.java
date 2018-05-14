//to check if the entered integer number is a palindrome
//package Insy.java;



import javax.swing.JOptionPane;

public class Hw5 
{
	
	public static int getSize(int num)
	{
       int Count=0 ;
       while(num > 0)
       {
       num = num / 10;
       Count = Count + 1;
       }
	return Count;
	}
	
	public static int[] fillArray( int num, int[] intArray )
	{
		String string = Integer.toString(num);
		for(int i = 0; i<string.length(); ++i){
			intArray[i] = Integer.parseInt(string.substring(i, i+1));
		}
		return intArray;
		
	}
    
	public static boolean isPalindrome( int[] intArray )
	{
		int i;
		int j= intArray.length-1;
		for(i=0;i<=intArray.length/2;i++)
		{
			if(intArray[i]==intArray[j])
			{
				j--;	
			} 
			else
			{
				break;
			}
		}
		
		if( i == intArray.length/2 + 1)
		{
			return true;
			
		}
		else
		{
			return false;
			
		}
		
	}
	public static void main(String [] args)
	{
		
		int num=0;
		int size=0;
		boolean flag;
		String message="";
	do
	{
	    num=Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive Integer or -99 to stop:"));
	    if (num!=0)
	    {
	    size= getSize (num);
	    int[] intArray = new int[size];
	    intArray = fillArray( num, intArray );
	    flag = isPalindrome(intArray);
	    if(flag==true)
		{
	    	message="Entered number: "+num+" is a palindrome";
		}
		else
		{
			message="Entered number: "+num+" is not a palindrome";
		}
	    JOptionPane.showMessageDialog(null, message);
	    }
	    else
	    JOptionPane.showMessageDialog(null, "Entered number: "+num+" is a palindrome");
	}while (num!=-99);
	}

}
