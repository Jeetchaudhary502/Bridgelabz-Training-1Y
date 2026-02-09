import java.util.Scanner;
class arr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i<arr.length;i++){
			System.out.println("Enter number" + (i+1));
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length;i++){
			if(arr[i]<0){
				System.out.println(arr[i] + "is a negative number");
			} else if(arr[i]==0){
				System.out.println(arr[i] + "The number is zero");
			} else{
				System.out.println(arr[i] + "is a positive number");
				if(arr[i]%2==0){
					System.out.println("The number is also even");
				} else {
					System.out.println("The number is also odd");
				}
			}
		} if(arr[0]<arr[4]){
		System.out.println("The last element is greater");
	    } else if(arr[0]==arr[4]){
			System.out.println("The first and last element are same");
		} else{
			System.out.println("The first element is larger");
		}
	} 
	} 
