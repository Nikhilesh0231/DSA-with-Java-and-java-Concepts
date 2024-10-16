public class InsertionSort {
  //Function to print array
  static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; ++i){
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int[] arr = {5, 2, 8, 1, 9};
    System.out.println("Before Sorting");
    printArray(arr);
    for(int i = 1 ; i < arr.length ; i++){
      int current = arr[i];
      int j = i-1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
      }
      //Placement
      arr[j + 1] = current;
    }
    System.out.println("\nAfter Sorting");
    printArray(arr);
  }
}
