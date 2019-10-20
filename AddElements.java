import java.util.*;
class RemoveDuplicate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size= sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0 ; i < size ; i++)
			arr[i] =sc.nextInt();

		System.out.println("Array is ::"+Arrays.toString(arr));
		int temp = 0;

		for (int i = 0 ; i < arr.length; i++) 
			temp +=arr[i];

		System.out.println(temp);
	}
}