import java.util.Scanner;
class arr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0; i<arr.length;i++){
			System.out.println("Enter age");
			arr [i]= sc.nextInt();
		}
		for(int i = 0; i<arr.length;i++){
			if(arr[i]<=0){
				System.out.println("Invalid");
			} else if (arr[i]>=18){
				System.out.println("Youre eligible to vote");
			} else {
				System.out.println("Youre not eligible to vote");
			}
		}
	
	}
}