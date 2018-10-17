import java.util.*;

public class e15265lab01q2{
	
	private static boolean redRange, greenRange, blueRange;
	
	public static void main(String args[]){
		//Read each component of one colour from the keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the color: ");
				
		int redVal   = keyboard.nextInt(); 
		int greenVal = keyboard.nextInt(); 
		int blueVal  = keyboard.nextInt();
		int greyVal  = 128;
		
		//Check all three components right around 128 or not
		redRange   = greyVal-32 <   redVal &&   redVal < greyVal+32;
		greenRange = greyVal-32 < greenVal && greenVal < greyVal+32;
		blueRange  = greyVal-32 <  blueVal &&  blueVal < greyVal+32;
		
		/* If all the components are in arround 128 then 
		 * either adding 128 to a componentsvalue or by 
		 * subtracting 128 from a components value.
		 * If not then each components subtract from 255
		 */
		if(redRange && greenRange && blueRange){
			redVal   = (redVal   >= greyVal) ? redVal   - greyVal : redVal   + greyVal;
			greenVal = (greenVal >= greyVal) ? greenVal - greyVal : greenVal + greyVal;
			blueVal  = (blueVal  >= greyVal) ? blueVal  - greyVal : blueVal  + greyVal;
		}else{
			redVal   = 255 - redVal;
			greenVal = 255 - greenVal;
			blueVal  = 255 - blueVal;
		}
		
		//Print the complement 
		System.out.println("The complement: "+redVal+" "+greenVal+" "+blueVal);
	}
}

