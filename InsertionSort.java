import java.util.Scanner;

class InsertionSort {
  public static void main(String[] args) {
    System.out.println("Enter size::");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    System.out.println("Enter elements::");
    int arr[] = new int[size];
    for(int i = 0 ; i < size ; i++)
    arr[i] = sc.nextInt();


    System.out.println("Before sorting ::: Original Array ::");
    for(int i = 0 ; i < size ; System.out.print(arr[i++]+"\t"));

    int unsorted = 1 ;
    while (unsorted < size){
      int sorted = unsorted -1 ;
      while(sorted >= 0 && arr[sorted] >arr[sorted + 1]){
        int c = arr[sorted];
        arr[sorted] = arr[sorted + 1];
        arr[sorted + 1] = c;
        sorted--;
      }
      unsorted++;
    }    
    System.out.println();
    System.out.println("After sorting ::: Sorted Array ::");
    for(int i = 0 ; i < size ; System.out.print(arr[i++]+"\t"));
  }
}