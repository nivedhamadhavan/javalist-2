import java.util.Scanner;

public class minutes {



	public static void main(String[] args) {

		double minutes =60*24*365;

		Scanner input = new Scanner(System.in);

		System.out.println("enter the number of minutes");

		double min=input.nextDouble();

		long years=(long)(min/minutes);

		int days=(int)(min/60/24)%365;

		System.out.println("years:" + years);

		System.out.println("days:"+ days);

	}



}
