import java.util.*;

class Main {
	public static void main(String[] args) {
		int size, i, index, low, high, mid, search;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array ::");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the element of Array ::");
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is " + Arrays.toString(arr));

		boolean sorted = true;
		i = 0;
		while (i < size - 1) {
			if (arr[i] > arr[i + 1]) {
				sorted = false;
				break;
			}
			i = i + 1;
		}
		if (!sorted) {
			System.out.println("Invalid binary search cant done");
		} else {
			System.out.println("Search element in Arrays :::");
			search = sc.nextInt();
			low = 0;
			high = size - 1;
			mid = (low + high) / 2;
			index = -1;
			while (low <= high) {
				if (arr[mid] == search) {
					index = mid;					
					break;
				} else if (search < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
				mid = (high+low)/2;
				
			}

			System.out.println("Index :: " + index +" = "+search);
		}

	}
}
