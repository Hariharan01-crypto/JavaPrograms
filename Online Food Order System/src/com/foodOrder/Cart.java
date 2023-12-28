package com.foodOrder;

import java.util.Scanner;

public class Cart{
	static String coupan1="Less50",coupan2="Less100",city="";
	static double totalpay=0;
	static int countb2,countf2,countp2,countm2,countd2,counti2;
	
	@SuppressWarnings("resource")
	static void addtocart(int quantity,double totalprice, int countb,int countf,int countp,int countm,int countd,int counti) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nTotal cost: "+totalprice);
		totalpay=totalprice;
		
		System.out.print("\ncoupan code:\n1.Less50\n**this code is applicable order above 199rs\n\n2.Less100\n**this code is applicale order above 149rs\n\nDo u want to apply the promocode press 1 0r 2 to Skip: ");
		sc=new Scanner(System.in);
		int c=sc.nextInt();
		if(c==1) {
	System.out.print("\nPlease enter the above coupan code : ");
	sc=new Scanner(System.in);
	String usercoup=sc.nextLine();
	if(coupan1.equalsIgnoreCase(usercoup)) {
		     if(totalprice>=150) {
			totalpay=totalprice-50;
			System.out.println("\ncoupan has been applied successfull");
			System.out.println("after applied coupan= "+totalpay);
		              }
		     else {
					System.out.println("coupan is only applicable on order above 150");
				}
		     }
	
	
	else if (coupan2.equalsIgnoreCase(usercoup)) {
			     if(totalprice>=200){
				totalpay=totalprice-100;
				System.out.println("coupan has been applied successfull");
				System.out.println("after applied coupan= "+totalpay);
				
			       }
			     else {
						System.out.println("coupan is only applicable on order above 200");
					}
			
		
     }else {
			System.out.println("invalid code");
		}

		
		
		
	}
		int cancel;
	System.out.println("\n\t\t\t\t------||total bill details||-------*\t\t\t\t\n");
	System.out.println("\t\t\t 1.quantity: "+quantity);
	System.out.println("\t\t\t ------------------ \t\t\t");
	System.out.println("\t\t\t Total Amount: "+totalpay);
	System.out.println("\n===>enter the payment mode<===\n1.online mode\n2.offline mode ");
	sc=new Scanner(System.in);
	int paymode=sc.nextInt();
	switch(paymode) {
	case 1:
		System.out.println("paid amount: "+totalpay);
		System.out.println("online payment succesfull");
		System.out.println("\n-------order has been successfully placed--------");
		
		System.out.print("---->If u want to cancel the order press 1 or 2 to continue shopping: ");
		
		sc=new Scanner(System.in);
		cancel=sc.nextInt();
		if(cancel==1) {
			
			if(countb==countb2) {	
				countb=countb+quantity;
				}
				else if(countf==countf2) {
					countf=countf+quantity;
				}
				else if(countp==countp2) {
					countp=countp+quantity;
				}
				else if(countm==countm2) {
					countm=countm+quantity;
				}
				else if(countd==countd2) {
					countd=countd+quantity;
				}
				else {
					counti=counti+quantity;
				}
		System.out.println("=>your order has been cancelled");
		@SuppressWarnings("unused")
		Resturant re=new Resturant(countb, countf, countp, countm, countd, counti);
		}
		else {
			System.out.println("\n\n\t\t-----Thank you for the order!!!-----\t\t\n\n");
		}
	
		
	break;
	case 2:
		System.out.println("order has been successfully placed as COD\n\n");
		System.out.print("*****If u want to cancel the order press 1 or 2 to continue shopping: ");
		
		sc=new Scanner(System.in);
		cancel=sc.nextInt();
	if(cancel==1) {
			
			if(countb==countb2) {	
				countb=countb+quantity;
				System.out.println("cb="+countb);
				}
				else if(countf==countf2) {
					countf=countf+quantity;
				}
				else if(countp==countp2) {
					countp=countp+quantity;
				}
				else if(countm==countm2) {
					countm=countm+quantity;
				}
				else if(countd==countd2) {
					countd=countd+quantity;
				}
				else {
					counti=counti+quantity;
				}
			System.out.println("=>your order has been cancelled");
			@SuppressWarnings("unused")
			Resturant re1=new Resturant(countb, countf, countp, countm, countd, counti);
			}
		
		
		else {
			System.out.println("\n\n\t\t-----Thank you for the order!!!-----\t\t\n\n");
		}
	break;
	default:
		System.out.println("invalid pay_option");
		break;
	}
	
		
	
		}
	
		
	}

