import java.util.Scanner;
class Fahrenheit
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the temperature in celcius");
		double celcius=input.nextInt();
		
	    double Fahrenheit=(celcius*9/5)+32;
		System.out.println("Temperature in Fahrenheit=" +Fahrenheit);
		
		
	}
	
	
	
	
}