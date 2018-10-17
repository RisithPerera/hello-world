import java.util.*;

public class e15265lab01q1{
	
	private static boolean special,big,weird;
	
	public static void main(String args[]){
		//Read the input number from the keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = keyboard.nextInt();
		
		//Check each characteristics
		if(num%15==0)                         special = true;
		if(num > 999)                         big     = true;
		if(num%5==0 && num%6==0 && num%18!=0) weird   = true;
		
		//Create a line with given number plus "is"
		String line = num + " is ";
		
		/* According to the above boolean values generate 
		 * the sentence and add to "line" string
		 */
		if(special){
			if(!big && !weird) line += "special but not scary.";	
			if(!big &&  weird) line += "special, weird and scary but not big.";	
			if( big && !weird) line += "special, big and scary but not weird.";
			if( big &&  weird) line += "special, big, weird and scary.";
		}else{
			if(!big && !weird) line += "not special and scary.";
			if(!big &&  weird) line += "weird and scary but not special and big.";	
			if( big && !weird) line += "big and scary but not special and weird.";	
			if( big &&  weird) line += "big, weird and scary but not special.";
		}
		
		//Print the line		
		System.out.println(line);
	}
}
