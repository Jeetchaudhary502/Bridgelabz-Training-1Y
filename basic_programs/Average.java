import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter your first number");
		
		int a=input.nextInt();
	
		System.out.println("enter your second number");
		int b=input.nextInt();
		System.out.println("enter your third number");
	    int c=input.nextInt();
		int sum=a+b+c;
		double average=sum/3;
		System.out.println("Average=" +average);
		
		
	}
	
	
	
	
}