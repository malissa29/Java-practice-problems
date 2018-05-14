//code to find area and perimeter of a rectangle, set and get inputs.
//package Insy.java;

//Malissa Deopras Figer
//package Insy.java;

import javax.swing.JOptionPane;



public class Hw4 extends Rectangle {
	public static void main (String [] args)
	{
	int option;
	String inputOptions="1 - to set the length \n";
	inputOptions = inputOptions + "2 - to set the width \n";
	inputOptions = inputOptions + "3 - to get the length \n";
	inputOptions = inputOptions + "4 - to get the width  \n";
	inputOptions = inputOptions + "5 - to get the perimeter  \n";
	inputOptions = inputOptions + "6 - to get the area  \n";
	inputOptions = inputOptions + "7 - to print the object as string  \n";
	inputOptions = inputOptions + "0 - to quit   \n";
	inputOptions = inputOptions + "Enter Option Number:\n";
	
	option=Integer.parseInt(JOptionPane.showInputDialog(inputOptions));
	
	Rectangle rect= new Rectangle ();
	
	while (option!=0)
	{
		switch(option)
		{
		case 1:
			int length;
			length= Integer.parseInt(JOptionPane.showInputDialog("Enter Length:"));
			rect.setLength(length);
			break;
			
		case 2:
			int width;
			width= Integer.parseInt(JOptionPane.showInputDialog("Enter Width:"));
			rect.setWidth(width);
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "the length is:" +rect.getLength());
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "the width is:" +rect.getWidth());
			break;
			
		case 5:
			JOptionPane.showMessageDialog(null, "the perimeter is:" +rect.getPerimeter());
			break;
			
		case 6:
			JOptionPane.showMessageDialog(null, "the area is:" +rect.getArea());
			break;
			
		case 7:
			JOptionPane.showMessageDialog(null, "Rectangle as a String is:" +rect.toString());
			break;
		
		}
		option=Integer.parseInt(JOptionPane.showInputDialog(inputOptions));
		
	}
	
	
		
	
	}

}

