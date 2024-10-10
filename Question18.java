
import java.util.Scanner;

public class Question18 {
  //Question -- >   Take an array of numbers as input and check if it is an array sorted in ascending order.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements want to store in array : ");
    int size = sc.nextInt();
    int numArray[] = new int[size];
    System.out.println("Enter the elements of array : ");
    for(int i = 0 ; i < size ; i++){
      numArray[i] = sc.nextInt();
    }
    boolean isAscending = true;
    for(int i = 0 ; i < size - 1 ; i++){
      if(numArray[i]>numArray[i+1]){
        isAscending = false;
      }
    }
    if(isAscending){
      System.out.println("Array is sorted in ascending order");
    }
    else{
      System.out.println("Array is not sorted in ascending order");
    }
  }
}
