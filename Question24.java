class Question24{
  //Question -> Sort the given array in descending order 
  //int arr[]={9,8,6,3,2,1,4,7};

  // Function to print the array
  static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; ++i){
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[]={9,8,6,3,2,1,4,7};
    System.out.println("Before Sorting");
    printArray(arr);
    for(int i = 0 ; i <arr.length;i++){
      int gratest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[gratest]) {
          gratest = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[gratest];
      arr[gratest] = temp;
    }
    System.out.println("\nAfter Sorting");
    printArray(arr);
  }
}