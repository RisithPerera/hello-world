import java.util.*;

class HelloWorld{
	public static void main(String args[]){
		boolean special = false;
		boolean big = false;
		boolean weird = false;
		boolean scary = false;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if(num%15==0)                        special = true;
		if(num > 999)                        big     = true;
		if(num%5==0 && num%6==0 && num%18!=0) weird   = true;
		if(big || weird)                     scary   = true;
		//Build the sentense
		System.out.println(special+","+big+","+weird+","+scary);
		String line = num+" is ";
		
		
		
		
		
		if(!special && !big && !weird && !scary) line = line + "not special and scary";
		if(!special && !big && !weird &&  scary) line = line + "scary but not special, big and weird";
		if(!special && !big &&  weird && !scary) line = line + "weird but not special, big and scary";
		if(!special && !big &&  weird &&  scary) line = line + "weird and scary but not special and big";
		if(!special &&  big && !weird && !scary) line = line + "big but not special, weird and scary";
		if(!special &&  big && !weird &&  scary) line = line + "big and scary but not special and weird";
		if(!special &&  big &&  weird && !scary) line = line + "big and weird but not special and scary";
		if(!special &&  big &&  weird &&  scary) line = line + "big, weird and scary but not special";
		if( special && !big && !weird && !scary) line = line + "special but not scary";
		if( special && !big && !weird &&  scary) line = line + "special and scary but not big and weird";
		if( special && !big &&  weird && !scary) line = line + "special and weird but not big and scary";
		if( special && !big &&  weird &&  scary) line = line + "special, weird and scary but not big";
		if( special &&  big && !weird && !scary) line = line + "special and big but not weird and scary";
		if( special &&  big && !weird &&  scary) line = line + "special, big and scary but not weird";
		if( special &&  big &&  weird && !scary) line = line + "special, big and weird but not scary";
		if( special &&  big &&  weird &&  scary) line = line + "special, big, weird and scary";
		
		System.out.print(line+".");
		/*
					 System.out.print(num+" is ");		
		if(special)  System.out.print("special,");
		if(big)	     System.out.print("big,");
		if(weird)    System.out.print("weird,");
		if(scary)    System.out.print("and scary");
					 System.out.print(" but not ");
		if(!special) System.out.print("special,");
		if(!big)	 System.out.print("big,");
		if(!weird)   System.out.print("weird,");
		if(!scary)   System.out.print("and scary.");
		* */
	}
}
