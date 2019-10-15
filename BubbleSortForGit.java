import java.util.*;
class BubbleSortForGit{
	public static void main(String[] args) {
		int j ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size;
		size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements For the array");
		for (int i = 0 ; i < size ; i++)
		{
			arr[i] =sc.nextInt();
		}
		System.out.println("Array is As follow"+Arrays.toString(arr));
		for (int i = 0 ; i < arr.length -1; i++) {
			for ( j = 0 ; j < arr.length -1 ; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
			
		}
		System.out.println(" Original Array is As follow "+Arrays.toString(arr));
		System.out.println(arr[1]);
	}
}