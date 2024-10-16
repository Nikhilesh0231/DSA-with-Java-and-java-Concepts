
class SelectionSort {

    // Function to print the array
    static void printArray(int arr[]) {
      for (int i = 0; i < arr.length; ++i){
        System.out.print(arr[i] + " ");
      }
    }

    public static void main(String args[]) {
        //time Complexity = O(n^2)
        //Selection Sort 
        int arr[] = {64, 34, 25, 12, 22};
        System.out.println("Before Sorting");
        printArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
          }
      System.out.println("\nAfter Sorting");
      printArray(arr);
    }
}
