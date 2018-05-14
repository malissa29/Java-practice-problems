//this program is to check if the year is a leap year or not
//package SampleCodes;

import javax.swing.JOptionPane;

public class h2 {
	public static void main (String [] args)
	{
		int year;
		String message="";
		year=Integer.parseInt(JOptionPane.showInputDialog("Enter the Year:"));
		
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
		{
			message="Year"+year+"is a leap year";
		}
		else if(year == -99)
		{
			System.exit(0);
		}
		else
		{
			message="Year"+" "+year+ " "+"is not a leap year";
		}
		
		JOptionPane.showMessageDialog(null, message);
				
	}

}
