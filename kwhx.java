//package SampleCodes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class kwhx {
	public static double findCharge(int kwh){
		double charge=0.0;
		
		if (kwh<=300)
		{
			charge=kwh*0.09;
		}
		else if(kwh>300 && kwh<=600)
		{
			charge=((kwh-300)*0.08) + 27;	
		}
		else if(kwh>600 && kwh<=1000)
		{
			charge=((kwh-600)*0.06) + 51;
		}
		else if(kwh>1000)
		{
			charge= ((kwh-1000)*0.05) + 75;
		}
		
		return charge;
		
	}
	
	public static void main (String [] args)
	{
		int CustomerNumber= 0, Usage=0; 
		double charge=0.0;
		int count =0;
		int totalusage= 0;
		double totalcharge= 0.0;
		String message="";
		
		JTextArea area= new JTextArea (count+3,3);
		 JScrollPane scroller = new JScrollPane(area);
	     area.setText("Customer No.\t Usage in Kwh.\t Total Charges\n");
	     area.append("\n");
	     area.append("------------------------------------------------");
		
        do{
        	CustomerNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter Customer Number 0r -999 to quit:"));
        	if(CustomerNumber!= -999)
        	{
        		count++;
        		Usage=Integer.parseInt(JOptionPane.showInputDialog("Enter Usage in kwh:"));
        		charge=findCharge(Usage);
        		totalusage= totalusage+Usage;
        		totalcharge= totalcharge+charge;
        		area.append("\n");
        		area.append(CustomerNumber+ "\t"+ Usage+ "\t"+ charge);
        	}
        }
        
        while (CustomerNumber!= -999);
        area.append("\n");
        area.append("-------------------------------------------------");
        area.append("\n" + count + "\t" + totalusage + "\t" + totalcharge);
       
        
        area.append(message+"\n");
        JOptionPane.showMessageDialog(null,area);
        	
		
	}

}
