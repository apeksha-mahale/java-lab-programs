package A;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Book 
{
	   public static void main(String[] args) 
	   {
		  int n,i,k,choice=0;
		  int avail=0;
		  Scanner sc =new Scanner(System.in);
		  TreeSet <Integer>treeadd = new TreeSet<Integer>();  // adding in the tree set
		   for(i=1;i<=10;i++)
		      treeadd.add(i);
		 
		 
		  while(choice!=3)
		  {
	      System.out.println("enter 1. to book tickets");
	      System.out.println("enter 2. for available tickets");
	      System.out.println("enter 3. to quit");
	      choice=sc.nextInt();
	      
	      
	      if(choice==1)
	      {
        		  System.out.println("enter no of tickets to be booked");
        		  k=sc.nextInt();
        		  
        		  try {
        			   if(k>5)
        		         throw new User("Can't boook more than 5 seats");
        		      } 
        		      catch(User exp) 
        		      {
        		        choice=1; //System.out.println(exp);
        		      }
        		  if(k<=5)
        		  {
            			  avail=avail+k;
            			  try {
            				   if(avail>50)
            			         throw new User("No seats are available");
            			      } 
            			      catch(User exp) 
            			      {
            			        //choice=1; //System.out.println(exp);
            			      } 
            		 if(avail<=50)
            		 {
                		    System.out.println("enter the seat numbers");
                		    for(i=0;i<k;i++)
                		   {
                			   int l=sc.nextInt();
                			   treeadd.remove(l);
                		   } 
                		   System.out.println("seats are allocated"); 
            		 }
        	       }
	      }
	      else if(choice==2)
	      {
    	    	  System.out.println("seats available are: ");
    	   	        Iterator<Integer> itr=treeadd.iterator(); 
    	   	   while (itr.hasNext())
    	   	   {
    	   		   Integer in=(Integer) itr.next();
    	   		   System.out.println(in);
    	   	   }   
    	  }
    	  else
    	  {
    	    break;
    	  }
		
	   }     
	
    }
}