package bOS;

import java.util.Scanner;


public class BeverageOrderingSystem {
	
	public static void main(String[] args) 
	{
		menu();
		System.out.println("Enter the order: " );
		Scanner scanner = new Scanner(System.in);
	    String readString = scanner.nextLine();
	    String[] orderedList = readString.trim().split(",");	    
	    calculation(orderedList);
	    
	}
	
	public static void menu()
	{
		System.out.println("\t\tWelcome to BOS");
		System.out.println("\n\t\t   Catalogue");
		System.out.println("**************************************************");
		System.out.println("1.	Hot.Coffee.Latte - $40");
		System.out.println("2.	Hot.Coffee.Cappuccino - $50");
		System.out.println("3.	Hot.Coffee.Espresso - $30");
		System.out.println("4.	Hot.Tea.Masala - $15");
		System.out.println("5.	Hot.Tea.Black - $10"); 
		System.out.println("6.	Cold.Coffee.Oreo - $110");
		System.out.println("7.	Cold.Coffee.Frape - $125");
		System.out.println("8.	Cold.Pop.Pepsi - $45");
		System.out.println("9.	Hot.Pop.Coke - $45");
		System.out.println("10.	Hot.Pop.Mirinda - $45");
		System.out.println("**************************************************");
	}
	
	public static void calculation(String orderedList[]) 
	{	
		int total = 0, rate = 0, finalRate = 0;
		double tax = 0 , finalTax = 0 ;
		String item= null;
		int quantity = 0 , price = 0 , serialNum = 0;
		int latteCount= 0 , cappuccinoCount= 0 , expressoCount= 0, masalaCount= 0 , blackCount= 0 , oreoCount= 0, frapeCount= 0, pepsiCount= 0, cokeCount= 0, mirindaCount= 0 ;
		Boolean isLatte= false , isCappuccino= false , isExpresso = false, isMasala = false , isBlack = false , isOreo = false, isFrape = false, isPepsi = false, isCoke = false, isMirinda = false ;
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("No. \t\t Item \t\t Quantity \t Price");
		System.out.println("------------------------------------------------------------------------");
		for (String orderNumber : orderedList )
		{
			if ( orderNumber.equalsIgnoreCase("1"))
			{
				rate= 40;
				tax= rate*(0.18);	
				item="Latte";
				latteCount++;
				isLatte = true;
			}
			else if ( orderNumber.equalsIgnoreCase("2"))
			{
				rate= 50;
				tax= rate*(0.18);	
				item="Cappuccino";
				cappuccinoCount++;
				isCappuccino = true;
			}
			else if ( orderNumber.equalsIgnoreCase("3"))
			{
				rate= 30;
				tax= rate*(0.18);
				item="Expresso";
				expressoCount++;
				isExpresso = true;
			}
			else if ( orderNumber.equalsIgnoreCase("4"))
			{
				rate= 15;
				tax= rate*(0.05);	
				item="Masala";
				masalaCount++;
				isMasala = true;
			}
			else if ( orderNumber.equalsIgnoreCase("5"))
			{
				rate= 10;
				tax= rate*(0.05);
				item="Black";
				blackCount++;
				isBlack = true;
			}
			else if ( orderNumber.equalsIgnoreCase("6"))
			{
				rate= 100;
				tax= rate*(0.18);
				item="Oreo";
				oreoCount++;
				isOreo = true;
			}
			else if ( orderNumber.equalsIgnoreCase("7"))
			{
				rate= 125;
				tax= rate*(0.18);
				item="Frape";
				frapeCount++;
				isFrape = true;
			}
			else if( orderNumber.equalsIgnoreCase("8") || orderNumber.equalsIgnoreCase("9") || orderNumber.equalsIgnoreCase("10"))
			{
				rate= 45;
				tax= rate*(0.21);
				if (orderNumber.equalsIgnoreCase("8"))
				{
					item="Pepsi";
					pepsiCount++;
					isPepsi = true;
				}
				else if (orderNumber.equalsIgnoreCase("9"))
				{
					item="Coke";
					cokeCount++;
					isCoke = true;
				}
				else
				{
					item="Mirinda";
					mirindaCount++;
					isMirinda = true;
				}
			}
			
			finalRate= finalRate+ rate;
			finalTax= finalTax+tax;
			total = finalRate+ (int) finalTax;
		}

		if ( isLatte)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Latte \t            " +latteCount+ "\t            " +(40*latteCount));
		}
		if ( isCappuccino)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Cappuccino \t    " +cappuccinoCount+ "\t            " +(50*cappuccinoCount));
		}
		if ( isExpresso)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Expresso \t    " +expressoCount+ "\t            " +(30*expressoCount));
		}
		if ( isMasala)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Masala \t    " +masalaCount+ "\t            " +(15*masalaCount));
		}
		if ( isBlack)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Black \t            " +blackCount+ "\t            " +(10*blackCount));
		}
		if ( isOreo)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Oreo \t            " +oreoCount+ "\t            " +(110*oreoCount));
		}
		if ( isFrape)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Frape \t            " +frapeCount+ "\t            " +(125*frapeCount));
		}
		if ( isPepsi)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Pepsi \t            " +pepsiCount+ "\t            " +(45*pepsiCount));
		}
		if ( isCoke)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Coke \t            " +cokeCount+ "\t            " +(45*cokeCount));
		}
		if ( isMirinda)
		{
			serialNum++;
			System.out.println("\n" + serialNum + ".\t\t Mirinda \t    " +mirindaCount+ "\t            " +(45*mirindaCount));
		}

		System.out.println("------------------------------------------------------------------------");
		System.out.println("		Total	                            " +finalRate);
		System.out.println("		Taxes	                            " + (int) finalTax);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("		Net                                 " +total );
		System.out.println("------------------------------------------------------------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
