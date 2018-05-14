
//this program is to compare the age of two persons
//package SampleCodes;

import javax.swing.JOptionPane;

public class h1 {
	public static void main (String [] args)
	{
		
		int age1, age2;
		String message="";
		String firstname1=JOptionPane.showInputDialog("Enter first Persons Name:");
		String lastname1=JOptionPane.showInputDialog("Enter first Persons Last Name:");
		String firstname2=JOptionPane.showInputDialog("Enter second Persons Name:");
		String lastname2=JOptionPane.showInputDialog("Enter second Persons Last Name:");
		age1=Integer.parseInt(JOptionPane.showInputDialog("Enter first Persons Age:"));
		age2=Integer.parseInt(JOptionPane.showInputDialog("Enter second Persons Age:"));
		
		if(age1<age2)
		{
			message="First Person:" +lastname1+", " +firstname1+" "+"("+age1+")\n"+
					"Second Person:"+lastname2+", "+firstname2+" "+"("+age2+")\n"+
					lastname1 +" is younger than "+ lastname2;
		}
		else if(age1>age2){
			message="First Person:" +lastname1 +firstname1+"("+age1+")\n"+
					"Second Person:"+lastname2 +firstname2+"("+age2+")\n"+
					lastname1 +" is older than "+ lastname2;
			
		}
		else
		{
			message="First Person:" +lastname1 +firstname1+"("+age1+")\n"+
					"Second Person:"+lastname2 +firstname2+"("+age2+")\n"+
					lastname1 +" is of same age as "+ lastname2;
		}
	JOptionPane.showMessageDialog(null, message);
	}

}
