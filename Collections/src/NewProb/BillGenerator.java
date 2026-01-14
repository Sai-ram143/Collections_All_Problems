
//genereate a bill domestic flight or international flight....

package NewProb;

import java.util.Scanner;

public class BillGenerator {

	
	public static void generateBill()
	{
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("1. Domestic Flight");
    	System.out.println("2. International Flight");
    	
    	System.out.print("Choose flight type: ");
    	
    	int choice = sc.nextInt();
    	sc.nextLine(); 
    	
    	String flightType = "";
    	
    	double baseFare = 0.0;
    	double taxRate = 0.0;
    	
    	switch (choice) {
    	case 1:
    		flightType = "Domestic";
    		baseFare = 4500;     
    		taxRate = 5;         
    		break;
    		
    	case 2:
    		flightType = "International";
    		baseFare = 15000;
    		taxRate = 12;        
    		break;
    		
    	default:
    		System.out.println("Invalid option!");
    		return;
    	}
    	
    	
    	System.out.print("Enter Passenger Name: ");
    	String name = sc.nextLine();
    	
    	System.out.print("Enter From Location: ");
    	String from = sc.nextLine();
    	
    	System.out.print("Enter To Location: ");
    	String to = sc.nextLine();
    	
    	double taxAmount = (baseFare * taxRate) / 100;
    	
    	double totalAmount = baseFare + taxAmount;
    	
    	
    	System.out.println("\n ========= FLIGHT BILL ==========");
    	
    	System.out.println("Passenger Name  : " + name);
    	
    	System.out.println("Flight Type : " + flightType);
    	
    	System.out.println("From : " + from);
    	
    	System.out.println("To : " + to);
    	
    	System.out.println("Base Fare : " + baseFare);
    	
    	System.out.println("Tax (" + taxRate + "% :" + taxAmount);
    	
    	System.out.println("Total Bill : " + totalAmount);
    
    }
     public static void main(String[] args) {
	
	    generateBill();
	
     }
}


