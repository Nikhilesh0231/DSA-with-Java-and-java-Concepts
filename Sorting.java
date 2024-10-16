class Sorting{
  //Sorting 
  //1.Bubble Sort 
  //2.Selection Sort
  //3.Insertion Sort

  // Fuction to print the array
  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
      }
  }
  public static void main(String[] args) {
    int arr[] ={7,8,3,1,2};
    //time Complexity = O(n^2)
    // Bubble Sort
    for(int i = 0 ; i < arr.length-1;i++){//n-1 
      for(int j = 0 ; j < arr.length-i-1;j++){//
       if(arr[j]>arr[j+1]){
        //Swap
        int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
       } 
      }
    }
    System.out.println("\nAfter Bubble Sort printing the array in asscending order");
    print(arr);//Calling print function
  }
}