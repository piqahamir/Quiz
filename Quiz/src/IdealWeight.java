import java.util.Scanner;

public class IdealWeight {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
	
		int heightFeet1, heightInches2,heightFeet3, heightInches4;
		
		
		//input height 
		System.out.println(">>>>>>FOR FEMALE<<<<<");
		System.out.print("Enter your height in feet : ");
		heightFeet1 = in.nextInt();
		System.out.print("Enter your height in inches : ");
		heightInches2 = in.nextInt();
		
		
		//output
		System.out.println("The ideal weight for female who is " + heightFeet1 + "'" + heightInches2 + " would be " + ((heightInches2*5)+40));
		System.out.println();
		
		
		System.out.println(">>>>>>FOR MALE<<<<<");
		System.out.print("Enter your height in feet : ");
		heightFeet3 = in.nextInt();
		System.out.print("Enter your height in inches : ");
		heightInches4 = in.nextInt();
		

		
		System.out.println("The ideal weight for male who is " + heightFeet3 + "'" + heightInches4 + " would be " + ((heightInches4*6)+50));
		
	}

}
