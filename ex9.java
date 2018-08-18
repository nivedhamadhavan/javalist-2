import java.util.Scanner;

public class calculate {



	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);

	        System.out.print("Input 1st integer: ");

	        int firstInt = input.nextInt();

	        System.out.print("Input 2nd integer: ");

	        int secondInt = input.nextInt();

            int diff = firstInt-secondInt;

            int sum = firstInt+secondInt;

            int pro =firstInt*secondInt;

	        System.out.println("Sum of two integers: "+ sum);

	        System.out.println("Difference of two integers:"+ diff);

	        System.out.println("Product of two integers: "+ pro);

	        System.out.println("Average of two integers: "+ (double) (firstInt + secondInt) / 2);

	        System.out.println("Distance of two integers: "+ Math.abs(firstInt - secondInt));

	        System.out.println("Max integer: " +Math.max(firstInt, secondInt));

	        System.out.println("Min integer: "+Math.min(firstInt, secondInt));

		



	}



}

© 2018 GitHub, Inc.
Terms
Privacy
Security
Status
Help
 
