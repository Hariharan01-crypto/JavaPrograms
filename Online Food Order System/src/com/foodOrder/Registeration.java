package com.foodOrder;

public class Registeration {
	private String name;
	private long mobno;
	private int doorNo,pin; 
	private String street,area,city,state;
	
	
	
	
	
public void setdetails(String name,long mobno,int doorNo,int pin,String street,String area,String city,String state) {
		this.name = name;
		this.mobno=mobno;
		this.doorNo=doorNo;
		this.street=street;
		this.area=area;
		this.city=city;
		this.pin=pin;
		this.state=state;
	}

	public String toString() {
		return "\n---registered profile---\nname     : "+name+"\nmobile no : "+mobno+"\nAddress   : "+doorNo+","+street+","+area+","+city+","+pin+".\nState:"+state+".\n";
	}






}
	
	
