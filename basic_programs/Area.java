import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter radius");
		int r=input.nextInt();
		double p=3.14;
	    double Area=p*r*r;
		System.out.println("Area of circle=" +Area);
		
		
	}
	
	
	
	
}