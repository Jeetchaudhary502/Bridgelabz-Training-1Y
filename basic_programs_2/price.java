import java.util.Scanner;
class price{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("quantity");
		double quantity = sc.nextInt();
		double unitPrice = 200;
		double totalPrice = unitPrice*quantity;
		System.out.println("total price is "+ totalPrice);
	}
}
