package b;

import a.Shirt;

final public class PullOver extends Shirt {
	
	   String color;
	   char has_hood,has_stripes;
		
		public PullOver(){
			super();
			size='M';
			price=1500;
			has_hood = 'Y';
		    has_stripes = 'N';
			}
        @Override
		public void getColor(String color) {
			this.color=color;
			
		}

        @Override
		public void putColor() {
        	System.out.println("This is pullover");
        	System.out.println("The color is :"+color);
        	System.out.println("The size is :"+size);
        	System.out.println("The price is :"+price);
        	if(( has_hood=='Y') && ( has_stripes=='Y')){ 
        		System.out.println("has hoodie");
        	    System.out.println("has stripes");
        	    }
        	else if(has_hood=='Y'){
        		System.out.println("has hoodie");
        	    System.out.println("but not stripes");
        	}
        	else if(has_stripes=='Y'){
        		System.out.println("has stripes");
        	    System.out.println("but not hoodie");
        	}
        	
        	else {System.out.println("No hoodie and stripes");}
        		
        	}
			
		}
		

