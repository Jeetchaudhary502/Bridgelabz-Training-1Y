import java.util.Scanner;
class perimeter
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter length");
		int length=input.nextInt();
		System.out.println("Enter breadth");
		int breadth=input.nextInt();
	    int peri=2*(length+breadth);
		System.out.println("Perimeter=" +peri);
		
		
	}
	
	
	
	
}