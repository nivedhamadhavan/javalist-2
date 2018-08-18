import java.util.Scanner;

	public class convert

	{

	    public static void main(String[] args) 

	    {

	        double celsius, fahrenheit;

	        Scanner obj = new Scanner(System.in);

	        System.out.print("Enter temperature in Fahrenheit:");

	        fahrenheit = obj.nextDouble();

	        celsius = (fahrenheit-32)*(0.5556);

	        System.out.println("Temperature in Celsius:"+celsius);        

	    }

	}
