import java.util.Scanner;
class calculation
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter base value");
		int basevalue=input.nextInt();
		System.out.println("enter exponential value");
		int exponentialvalue=input.nextInt();
		int result = Math.pow(basevalue,exponentialvalue); 
	    System.out.println("The result : "+resultṣ);
	}
}