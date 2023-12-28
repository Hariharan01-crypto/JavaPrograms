package com.foodOrder;
import java.util.*;

public class Resturant {
	static double totalprice,briyani=100,fried_rice=100,parotta=15
			,idly=10,dosai=30,meals=70;
		static int quantity=0,dishno,countb=4,countf=5,countp=20,counti=40,countd=20,countm=5;	
	
	Resturant(int countb,int countf,int countp,int countm,int countd,int counti){
		Resturant.countb=countb;
		Resturant.countf=countf;
		Resturant.countp=countp;
		Resturant.countm=countm;
		Resturant.countd=countd;
		Resturant.counti=counti;
		
	}
	static void chennaiResturentList(){
		@SuppressWarnings("resource")
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n******resturant available in your location chennai*****\n\n1.Nonveg resturant\n2.Veg resturant");
		int roption;
		System.out.print("\nenter the resterant option: ");
		sc=new Scanner(System.in);
		roption=sc.nextInt();
		switch(roption) {
		case 1:
			
			System.out.println("\n******Menu*******\n 1.briyani - 100rs / stock- "+countb+
					"\n 2.fried rice - 100rs / stock-"+countf+"\n 3.parotta - 15rs / stock- "+countp);
	        System.out.print("enter the dishno: ");
	 
	        sc=new Scanner(System.in);
	        dishno=sc.nextInt();
	        
			if(dishno==1) {
				
				System.out.print("enter quantity: ");
				sc=new Scanner(System.in);
				quantity=sc.nextInt();
				if(quantity<=countb) {
					
				countb-=quantity;
				double totalprice=quantity*briyani;
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
				}
				else {
					System.out.println("out of Stock");
				}
			}
			else if(dishno==2){
				
				System.out.println("enter quantity: ");
			       int quantity = sc.nextInt();
			       if(quantity<=countf) {
			    	   countf-=quantity;   
				totalprice=quantity*fried_rice;
				
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
			       }
			       else {
			    	   System.out.println("out of Stock");
			       }
			}

			else if(dishno==3) {
			
				System.out.println("enter quantity: ");
				sc=new Scanner(System.in);
				int quantity=sc.nextInt();
				if(quantity<=countp) {
					countp-=quantity;
				totalprice=quantity*parotta;
				
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);

				}else {
			    	   System.out.println("out of Stock");
			       }
				
			}
			else {
				System.out.println("invalid dish");
			}
			
			
			break;
			
case 2:
			System.out.println("******vegMenu*******\n 1.meals - 70rs / stock - "+countm+
				 "\n 2.dosai - 30rs / stock - "+countd+"\n 3.idly - 10rs / stock - "+counti);
			System.out.println("\n==> Enter the dishno: ");
	        dishno=sc.nextInt();
			if(dishno==1) {
			
				System.out.println("==> Enter quantity: ");
				sc=new Scanner(System.in);
			    int quantity=sc.nextInt();
			    if(quantity<=countm) {
			    	countm-=quantity;
				totalprice=quantity*meals;
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
			    }
			    else {
			    	System.out.println("out of Stock");
			    }
			
				
			}else if(dishno==2){
			
				System.out.println("enter quantity: ");
				sc=new Scanner(System.in);
			      int quantity = sc.nextInt();
			      if(quantity<=countd) {
			    	  countd-=quantity;
				totalprice=quantity*dosai;
			      
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
			      }
			      else {
			    	  System.out.println("out of Stock");
			      }
			}
			else if(dishno==3) {
				
				System.out.println("enter quantity: ");
				sc=new Scanner(System.in);
				int quantity=sc.nextInt();
				if(quantity<counti) {
					counti-=quantity;
				totalprice=quantity*idly;
				
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
				}else {
					System.out.println("out of stock");
				}
				
			}else {
				System.out.println("invalid dish");
			}
		break;
		default: System.out.println("invalid option");
		
		break;
		}
		
		
		
	}
	

	static  void maduraiResturentList() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("******resturant available in your location madurai*****\n 1.resturant1\n2.Veg resturant2");
		int roption;
		System.out.print("enter the resterant option: ");
		sc=new Scanner(System.in);
		roption=sc.nextInt();
		switch(roption) {
		case 1:
			System.out.println("\n******Menu*******\n 1.briyani - 100rs / stock- "+countb+
					"\n2.fried rice - 100rs / stock-"+countf+"\n 3.parotta - 15rs / stock- "+countp);
	       
	        System.out.println("in stock="+countb);
	        sc=new Scanner(System.in);
	        int dishno=sc.nextInt();
			if(dishno==1) {
				System.out.println("enter quantity: ");
				sc=new Scanner(System.in);
				int quantity=sc.nextInt();
				if(quantity<countb) {
					countb-=quantity;
				totalprice=quantity*briyani;
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
				}
				
			}else if(dishno==2){
				
				System.out.println("enter quantity: ");
				sc=new Scanner(System.in);
			       int quantity = sc.nextInt();
			       if(quantity<=countf) {
			    	   countf-=quantity;   
				totalprice=quantity*fried_rice;
				
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
			       }
			       else {
			    	   System.out.println("out of Stock");
			       }
			}
			else if(dishno==3) {
				System.out.println("enter quantity: ");
				sc=new Scanner(System.in);
				int quantity=sc.nextInt();
				
				if(quantity<=countp) {
					countp-=quantity;   
				totalprice=quantity*parotta;
				
				Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
			       }
			       else {
			    	   System.out.println("out of Stock");
			       }				
			}else {
				System.out.println("invalid dish");
			}
			break;
			
case 2:
			System.out.println("******vegMenu*******\n 1.meals - 70rs / stock - "+countm+
					 "\n 2.dosai - 30rs / stock - "+countd+"\n 3.idly - 10rs / stock - "+counti);
			System.out.println("enter the dishno: ");
			sc=new Scanner(System.in);
	        dishno=sc.nextInt();
			if(dishno==1) {
				System.out.println("enter quantity: ");
				int quantity=sc.nextInt();
				 if(quantity<=countm) {
					 countm-=quantity;
					totalprice=quantity*meals;
					Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
				    }
				    else {
				    	System.out.println("out of Stock");
				    }
				
			}else if(dishno==2){
				System.out.println("enter quantity: ");
				sc=new Scanner(System.in);
			       int quantity = sc.nextInt();
				
			       if(quantity<=countd) {
			    	   countd-=quantity;
					totalprice=quantity*dosai;
					Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
				    }
				    else {
				    	System.out.println("out of Stock");
				    }
			}
			else if(dishno==3) {
				System.out.println("enter quantity: ");
				sc=new Scanner(System.in);
				int quantity=sc.nextInt();
				
				 if(quantity<=countm) {
					 counti-=quantity;
					totalprice=quantity*idly;
					Cart.addtocart(quantity,totalprice,countb,countp,countf,countm,countd,counti);
				    }
				    else {
				    	System.out.println("out of Stock");
				    }
				
			}else {
				System.out.println("invalid dish");
			}
			break;
         default: System.out.println("invalid option");

         break;
		
		
		}
		
	
		
		
		
	}


}
