package com.class13;

public class MobilePhone {
	
	public double size;
	public String color;
	public String model;
    public String make;
    public double price;
    
public static void main(String[] args) {
		
		MobilePhone iPhone=new MobilePhone();
		iPhone.model="iPhone 12";
        iPhone.price=999;
        iPhone.size=6.4;
        iPhone.make="Apple";
        iPhone.color="Black";
        
        
        MobilePhone samsungS21=new MobilePhone();
        samsungS21.model="S21";
        samsungS21.price=800;
        samsungS21.size=6.8;
        samsungS21.make="Samsung";
        samsungS21.color="Phatom Black";
        
		
		MobilePhone Nokia=new MobilePhone();
		Nokia.model="225";
		Nokia.price=50;
		Nokia.size=2.8;
		Nokia.make="Nokia";
		Nokia.color="Grey";
		
		
		
		
		
	}
    
    
    
}
