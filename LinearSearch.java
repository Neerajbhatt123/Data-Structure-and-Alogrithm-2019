import java.util.*;

class LinearSearch
 {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter the size ::");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements ::");
		for ( i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		System.out.println("Arrays ::" + Arrays.toString(arr));
		System.out.println("Search ::");
		int search = sc.nextInt();
		for ( i = 0; i < size; i++) {
			if (arr[i] == search) {
				System.out.println("Search element position = " + (i + 1) + " Searched elements =" + search);
				break;
			}
		}
		if(i==size)
		System.out.println("not found");
	}
}