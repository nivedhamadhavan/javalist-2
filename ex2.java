import java.util.Scanner;

public class meters {



	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter the value in inches");

		double inch = input.nextDouble();

		double meters =inch*0.0254;

		System.out.println("Meter is"+ meters );



	}



}
