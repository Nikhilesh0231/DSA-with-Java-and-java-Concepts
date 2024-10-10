
import java.util.Scanner;

public class Question15 {
  //Question--> Take an array as input from the user,Search for agiven number x and print the index at which it occurs.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt();
    int array[] = new int[size];
    System.out.print("Enter the Elements in the array : ");
    for(int i = 0 ; i < array.length ; i++){
      array[i]=sc.nextInt();
    }
    System.out.print("Enter any elment of the same array to know the index of the element in the array : ");
    int x = sc.nextInt();
    for(int i = 0 ; i < array.length ; i++){
      if(x==array[i]){
        System.out.println("Your Entered element is stored at index : " + i);
      }
    }
  }  
}
