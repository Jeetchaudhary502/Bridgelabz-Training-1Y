import java.util.Scanner;
class Addition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter birth year ");
		int birthYear = sc.nextInt();
		System.out.println("Enter current year ");
		int currentYear = sc.nextInt();
		
		int harryAge = currentYear - birthYear;
		
	System.out.println("Harry's age is "+ harryAge);
	
	}
}