public class Question23 {
  //Question -> Sort this array using Bubble sort in descending order
  //arr[] = {1,2,7,6,5,4}

  //function to print the array 
  public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
      }
  }
  public static void main(String[] args) {
    int arr[] = {1,2,7,6,5,4};
    System.out.println("Original array");
    printArray(arr);

    //sorting array in desc
    for(int i = 0 ; i < arr.length-1; i++){
      for(int j = 0 ; j < arr.length-i-1; j++){
        if(arr[j] < arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    System.out.println("After sorting array in desc");
    printArray(arr);
  }
}
