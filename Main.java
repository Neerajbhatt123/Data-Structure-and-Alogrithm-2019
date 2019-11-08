import java.util.*;

class Main {

  Scanner sc = new Scanner(System.in);

  void merge(int arr[], int l, int m, int r) {

    System.out.println("BEFORE Arrays ::" + Arrays.toString(arr));
    System.out.println("L ::" + l + "R ::" + r);

    int newSize = r - l + 1;
    int arr1[] = new int[newSize];

    int i = l, j = m + 1, k = 0;

    while (i <= m && j <= r) {
      if (arr[i] <= arr[j]) {
        arr1[k] = arr[i];
        i += 1;
      } else {
        arr1[k] = arr[j];
        j += 1;
      }
      k += 1;
    }
    while (i <= m) {
      arr1[k] = arr[i];
      i += 1;
      k += 1;
    }
    while (j <= r) {
      arr1[k] = arr[j];
      j += 1;
      k += 1;
    }

    int x = l;
    k = 0;

    while (x <= r) {
      arr[x] = arr1[k];
      x += 1;
      k += 1;
    }

    System.out.println("L ::" + l + "R ::" + r);
    System.out.println("AFTER Arrays ::" + Arrays.toString(arr));

  }

  void mergeSort(int arr[], int l, int r) {

    System.out.println("L ::" + l + ", R ::" + r);
    System.out.println("MErge SOrt Arrays ::" + Arrays.toString(Arrays.copyOfRange(arr, l, r+1)));

    int x = sc.nextInt();
    System.out.println(x);

    if (l < r) {
      int m = (l + r) / 2;
      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);
      merge(arr, l, m, r);
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int arr[] = new int[size];
    for (int i = 0; i < size; i++)
      arr[i] = sc.nextInt();

    System.out.println("ORIGINAL Arrays ::" + Arrays.toString(arr));

    Main ms = new Main();
    ms.mergeSort(arr, 0, size-1);

    System.out.println("MERGESORT Arrays ::" + Arrays.toString(arr));
  }
}