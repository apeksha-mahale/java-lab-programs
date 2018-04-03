import java.util.*;
import java.io.*;

class MissedPhone 
{
	String name, phoneNo, time;

	MissedPhone(String n, String p, String t)
	{
		name = n;
		phoneNo = p;
		time = t;
	}

	public String toString()
	{
		return "\nName: " + name + "\nPhone No: " + phoneNo + "\nTime: " + time;
	}
}

/*class Phone
{
	int key;
	String name_a, phoneNo_a;

	Phone(int k, String n, String p)
	{
		key = k;
		name_a = n;
		phoneNo_a = p;
	}
}
*/
class Phone
{
	//int key;
	String name_a, phoneNo_a;

	Phone( String n, String p)
	{
		//key = k;
		name_a = n;
		phoneNo_a = p;
	}
}
class newPhoneClass
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		 
		 HashMap<Integer, Phone> numberMap = new HashMap<Integer, Phone>();   
		
		ArrayList<MissedPhone> mlist = new ArrayList<MissedPhone>();
		
		numberMap.put(1, new Phone( "ABC", "1234"));
		numberMap.put(2, new Phone( "Agh", "1678"));
		numberMap.put(3, new Phone( "hgh", "12348"));
		numberMap.put(4, new Phone( "ssf", "7890"));
		numberMap.put(5, new Phone( "private", "2345"));
		numberMap.put(6, new Phone( "tyu", "1238"));
		numberMap.put(7, new Phone( "private", "7789"));
		

		while(true)
		{
			System.out.println("\n1) Add\n2) Log\n3) Delete\n4) Exit: ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				if(count > 10)
				{
					mlist.remove(0);
					count--;
				}
				Random rand = new Random();
				int num1 = rand.nextInt(7);
				
				Phone obj1 = numberMap.get(num1);
				int H = c.get(Calendar.HOUR);
				int M = c.get(Calendar.MINUTE);
				int S = c.get(Calendar.SECOND);
				String time1 = H + ":" + M + ":" + S;
				mlist.add(new MissedPhone(obj1.name_a, obj1.phoneNo_a, time1));
				count++;
				break;

				case 2:
				for(int i = 0; i < mlist.size(); i++)
				{
					MissedPhone obj2 = mlist.get(i);
					System.out.println("\nName: " + obj2.name + "\nPhone No: " + obj2.phoneNo + "\nTime: " + obj2.time);
					System.out.println("\n1) Display next\n2) Display next and delete current: ");
					int ch1 = sc.nextInt();
					switch(ch1)
					{
						case 1:
						continue;

						case 2:
						mlist.remove(i);
						i--;
						count--;
						continue;
					}
				}
				break;

				case 3:
				System.out.println("\nEnter number to delete: ");
				Scanner sc1 = new Scanner(System.in);
				String delNum = sc1.nextLine();
				for(int i = 0; i < mlist.size(); i++)
				{
					MissedPhone obj2 = mlist.get(i);
					if(obj2.phoneNo.equals(delNum))
					{
						mlist.remove(i);
						count--;
						System.out.println("Deleted! (" + delNum + ")");
					}
				}
				break;

				case 4:
				System.exit(0);
			}
		}
	}
}