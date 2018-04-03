import java.util.*;

abstract class Vehicle
{
	String yom, name;
	int wheel;
	abstract void putData(String a, String b);
	abstract void getData();   
}

class TwoWheeler extends Vehicle
{
	TwoWheeler()
	{
		this.wheel = 2;
	}
	
	void putData(String y, String n)
	{
		this.yom = y;
		this.name = n;
	} 
	
	void getData() 
	{
		System.out.println("Bike details: \n1) Name: "+this.name+"\n2) Year of Manufacture: "+this.yom+"\n3) No. of Wheels: "+this.wheel);  
	}
}

final class FourWheeler extends Vehicle
{
	void putData(String y, String n)
	{
		this.yom = y;
		this.name = n;
		this.wheel = 4;
	} 
	
	void getData() 
	{
		System.out.println("Car details: \n1) Name: "+this.name+"\n2) Year of Manufacture: "+this.yom+"\n3) No. of Wheels: "+this.wheel);  
	}
}

class MyTwoWheeler extends TwoWheeler 
{
	MyTwoWheeler()
	{
		super();
	}
	
	
	void putData(String y)
	{
		this.name = "Splendor";
		this.yom = y;
	}
	
	void getData() 
	{
		System.out.println("Bike details: \n1) Name: "+this.name+"\n2) Year of Manufacture: "+this.yom+"\n3) No. of Wheels: "+this.wheel);  
	}
}

class VehicleMain
{
	public static void main(String[] args)
	{
		MyTwoWheeler S1 = new MyTwoWheeler();
		TwoWheeler S2 = new TwoWheeler();
		FourWheeler S3 = new FourWheeler();
		S1.putData("2014");
		S1.getData();
		S2.putData("2015", "Gixxer SF");
		S2.getData();
		S3.putData("2016", "Brezza");
		S3.getData();
	}
}
