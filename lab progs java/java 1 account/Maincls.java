import java.util.*;

class account {
	int accno;
	String name;
	int pno;
	float balance;
	Scanner s=new Scanner(System.in);
	account(int a,String n,int p,float b)
	{
		accno=a;
		name=n;
		pno=p;
		balance=b;
	}
	void deposit()
	{
		System.out.println("\n Enter the amount to be deposited \n");
		float money;
		money=s.nextFloat();
		System.out.println("\n Amount deposited = " + money);
		balance+=money;
	}
	void withdraw()
	{
		
		System.out.println("\n Enter the amount to be withdraw \n");
		float with;
		with=s.nextFloat();
		if((balance-with)<1000)
			System.out.println("Cannot withdraw balance is less than 1000");
		else{
		System.out.println("\n Amount with = " + with);
		balance-=with;
		}
		
	}
	void display()
	{
		System.out.println("Name :" +name);
		System.out.println("Pno:"+pno);
		System.out.println("Account no :"+accno);
		System.out.println("Balance :"+balance);

	}
}
public class Maincls
{
	public static void main(String[] args) 
	{
		
		int n;
		String ch;
		Scanner a=new Scanner(System.in);
		int accno;
		String name;
		int pno;
		float balance;
		
		System.out.println("Enter no. of employess");
		
		n=a.nextInt();
		HashMap<Integer,account> hm=new HashMap<Integer,account>();//array of accounts
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name \n");
			ch=a.nextLine();//only for string
			name=a.nextLine();
			System.out.println("Enter phno \n");
			pno=a.nextInt();
			System.out.println("Enter accno \n");
			accno=a.nextInt();
			System.out.println("Enter first deposit \n");
			balance=a.nextFloat();
			hm.put(accno,new account(accno,name,pno,balance));			
		}
		do{
			System.out.println("\n1.deposit 2.withdraw 3.display");
			int choice;
			choice=a.nextInt();
			ch=a.nextLine();
			switch(choice)
			{
			case 1:System.out.println("enter the account no:");
				   accno=a.nextInt();
				   ch=a.nextLine();
				   boolean t1=hm.containsKey(accno);
				   if(t1)
				   {
					   account thisone=hm.get(accno);
					   thisone.deposit();
				   }
				   else
					   System.out.println("No such account \n");
				   break;
			case 2:System.out.println("enter the account no:");
			       accno=a.nextInt();
			       ch=a.nextLine();
			       boolean t2=hm.containsKey(accno);
			       if(t2)
			       {
			    	   account thisone=hm.get(accno);
			    	   thisone.withdraw();
			       }
			       else
			    	   System.out.println("No such account \n");
			       break;
			case 3:	for(Map.Entry<Integer,account> entry:hm.entrySet()){ //TO iterate to a hash map you need to use map entry    
		        	account b=entry.getValue();  
		        	if(b.balance<10000)
		        	{
		        		b.display();
		        	}
		        	   
		    		}
					break;
		   default: System.out.println("wrong choice:");
			}
			System.out.println("want to continue:(y/n):");
			ch=a.nextLine();
		}while(ch.equalsIgnoreCase("y"));
		// TODO Auto-generated method stub

	}

}

