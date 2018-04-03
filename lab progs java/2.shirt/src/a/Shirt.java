package a;

import java.util.*;


public abstract class Shirt {
	
protected char size;
protected int price;
String color;

protected Shirt(){
	this.size='L';
	this.price=2000;
}

abstract protected void getColor(String color);

abstract protected void putColor();

}

class FormalShirt extends Shirt{
	
	char has_full_sleeve,has_stripes;
	
	protected FormalShirt(){
		super();
		has_full_sleeve = 'N';
	    has_stripes = 'Y';
	  }
	
  
	public void getColor(String color) {
		this.color=color;
		
	}

	public void putColor() {
	System.out.println("This is formalShirt");
	System.out.println("The color is :"+color);
	System.out.println("The size is :"+size);
	System.out.println("The price is :"+price);
	if(( has_full_sleeve=='Y') && ( has_stripes=='Y')){ 
		System.out.println("has full sleeve");
	    System.out.println("has stripes");
	    }
	else if(has_full_sleeve=='Y'){
		System.out.println("has full sleeve");
	    System.out.println("but not stripes");
	}
	else if(has_stripes=='Y'){
		System.out.println("has stripes");
	    System.out.println("but not full sleeve");
	}
	
	else {System.out.println("No full sleeve and stripes");}
		
	}
		
	}



class PartyWear extends FormalShirt{
	
	String brand;
	
	public PartyWear(){
		super();
		brand = "raymonds";
		
	}
	

	public void getColor(String color) {
		this.color=color;
		
	}

	public void putColor() {
		System.out.println("This is partyWear");
		System.out.println("The brand is"+brand);
		System.out.println("The color is :"+color);
		System.out.println("The size is :"+size);
		System.out.println("The price is :"+price);

		
	}
	

}


