import java.util.Scanner;
class simpleintrest
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the principle_amount");
		int principle_amount=input.nextInt();
		System.out.println("Enter rate");
		int rate=input.nextInt();
		System.out.println("Enter time");
		
		
		int time=input.nextInt();
	    double simple=(principle_amount*rate*time)/100;
		System.out.println("simple intrest is=" +simple);
		
		
	}
	
	
	
	
}