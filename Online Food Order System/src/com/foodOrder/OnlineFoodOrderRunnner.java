package com.foodOrder;

import java.util.Scanner;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;

public class OnlineFoodOrderRunnner  {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		int doorNo = 0,pin=0;
		long mobno=0l;
		String name="";
		String street="";
		String area="";
		String city="";
		String state="";
	
	System.out.println("\n\t\t\t\t------------- Welcome to Online Food Order --------------\t\t\t\n");
	System.out.println("\n==>| pls login |<==\n");
	
	do {
		try{ 
	System.out.print("-->Enter your mobile no : ");
	sc=new Scanner(System.in);
	mobno=sc.nextLong();
	 }catch(InputMismatchException ime) { System.out.println("\n=> pls enter correct mobile no! ");}
		if(!(mobno>999999999l&&mobno<9999999999l)){
	System.out.println("=>[mobile no should be in 10 digits]\n");
}
		
	}while(!(mobno>999999999l&&mobno<9999999999l));
	
	
	
	HashSet<Long> mobset=new HashSet<Long>();
	for(int j=0;j<mobset.size();j++) {
		  Iterator<Long> itr=mobset.iterator();  
		  while(itr.hasNext()){  
		   itr.next();
	if(mobno==itr.next()) {
	System.out.println("mob_no already exist!");

	try{System.out.print("-->Pin code: ");
	sc=new Scanner(System.in);
	pin =sc.nextInt();}catch(InputMismatchException ime) {}
	
	System.out.print("state: ");
	sc=new Scanner(System.in);
	state =sc.nextLine();
	
	Registeration r=new Registeration();
	r.setdetails(name,mobno, doorNo, pin, street, area, city, state);
	System.out.println(r.toString());
	while(i==1) {
		
		

	if("chennai".equalsIgnoreCase(city)||pin>=600001&&pin<=600131) {
		
		 
		 Resturant.chennaiResturentList();
	}
	else if("madurai".equalsIgnoreCase(city)||pin>=625001&&pin<=625020)
	{
		Resturant.maduraiResturentList();
	}
	else
	{
		System.out.println("-------- online order is not available in your location!!! ---------\n");
	}
	System.out.print("=====>enter 1 to coutinue shopping and 2 to exit: ");
	sc=new Scanner(System.in);
	i=sc.nextInt();
	try{System.out.print("-->Pin code: ");
	sc=new Scanner(System.in);
	pin =sc.nextInt();}catch(InputMismatchException ime) {}
	}
	
	}
		  
	
	}
		  
	}
	mobset.add(mobno);
	System.out.print("\n-->enter Name      : ");
	sc=new Scanner(System.in);
	name = sc.nextLine();
	System.out.println("\n=====>  enter the address below  <=====\n");
	
	try{System.out.print("-->doorno: ");
	sc=new Scanner(System.in);
	doorNo=sc.nextInt();}catch(InputMismatchException ime) {}
	
	System.out.print("-->street: ");
	sc=new Scanner(System.in);
    street=sc.nextLine();
    
    System.out.print("-->area: ");
    sc=new Scanner(System.in);
    area=sc.nextLine();
    
    System.out.print("-->city: ");
    sc=new Scanner(System.in);
	 city=sc.nextLine();
	
	try{System.out.print("-->Pin code: ");
	sc=new Scanner(System.in);
	pin =sc.nextInt();}catch(InputMismatchException ime) { }
	
	System.out.print("-->state: ");
	sc=new Scanner(System.in);
	 state =sc.nextLine();
	
	Registeration r=new Registeration();
	r.setdetails(name,mobno, doorNo, pin, street, area, city, state);
	System.out.println(r.toString());
	while(i==1) {
	if("chennai".equalsIgnoreCase(city)||pin>=600001&&pin<=600131) {
		 
		 Resturant.chennaiResturentList();
	}
	else if("madurai".equalsIgnoreCase(city)||pin>=625001&&pin<=625020)
	{
		Resturant.maduraiResturentList();
	}
	else
	{
	
		System.out.println("\t---------------[ Sorry! online order is not available in your location!!!  ]---------------\n");
		System.out.println("\t-------------please enter correct pin code or correct City loacation-------------");
		try{System.out.print("Pin code: ");
		sc=new Scanner(System.in);
		pin =sc.nextInt();}catch(InputMismatchException ime) {}
		 System.out.print("city: ");
		    sc=new Scanner(System.in);
			city=sc.nextLine();
	}
	System.out.print("======>enter 1 to coutinue shopping and 2 to exit: ");
	sc=new Scanner(System.in);
	i=sc.nextInt();
	
	}
	
	
	}

}
