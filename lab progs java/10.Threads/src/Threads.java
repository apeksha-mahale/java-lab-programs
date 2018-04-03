import java.util.Scanner;

public class Threads {
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an number:");
		final int num = s.nextInt();
		
		System.out.println("Enter a word:");
		final String word = s.next();
		
		Runnable r1 = new Runnable(){
			public void run(){
				int n = num;
				String text = "";
				while(n > 0){
					switch(n%10){
					case 1: text =  " one " + text; break;
					case 2: text =  " two " + text; break;
					case 3: text =  " three " + text; break;
					case 4: text =  " four " + text; break;
					case 5: text =  " five " + text; break;
					case 6: text =  " six " + text; break;
					case 7: text =  " seven " + text; break;
					case 8: text =  " eight " + text; break;
					case 9: text =  " nine " + text; break;
					case 0: text =  " zero " + text; break;
					}
					n /= 10;
				}
				System.out.println(text);
			}
		};
		
		Runnable r2 = new Runnable(){
			public void run(){
				int vowels = 0, consonants = 0;
				for(int i=0; i< word.length(); i++){
					char c = word.charAt(i);
					switch(c){
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u':
						case 'A':
						case 'I':
						case 'O':
						case 'U': vowels++; break;
						default: consonants++;	
					}
				}

				System.out.println("Vowels: "+ vowels + " Consonants: "+consonants);
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
		
	}
}
