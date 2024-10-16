public class Question25 {
  //Question Sort the Array in desc order using insertion sort approch
  //int arr[] ={23 ,12 ,34,67,45}; 
   static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; ++i){
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[] ={23 ,12 ,34,67,45};
    System.out.println("Before Sorting");
    printArray(arr);
    for(int i = 1 ; i < arr.length ; i++){
      int current = arr[i];
      int j = i-1;
      while (j >= 0 && arr[j] < current) {
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