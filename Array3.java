
import java.util.Scanner;

public class Array3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ente the size of the array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array : ");
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Array elements are : ");
    for(int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }  
}
