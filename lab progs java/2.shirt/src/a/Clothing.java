package a;

import b.PullOver;

public class Clothing {
	
	public static void main(String args[]){
		PartyWear p1 = new PartyWear();
		FormalShirt f1= new FormalShirt();
		PullOver p2 = new PullOver();
		p1.getColor("red");
		p1.putColor();
		f1.getColor("White");
		f1.putColor();
		p2.getColor("black");
		p2.putColor();
	}

}
