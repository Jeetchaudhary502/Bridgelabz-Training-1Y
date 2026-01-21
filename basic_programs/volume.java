import java.util.Scanner;
class volume
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter radius");
		int radius=input.nextInt();
		System.out.println("Enter height");
		int height=input.nextInt();
		double p=3.14;
	    double volume=p*radius*radius*height;
		System.out.println("Volume of Circle=" +volume);

	
		
		
	}
	
	
	
	
}