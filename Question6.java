
import java.util.Scanner;

public class Question6 {
  //Question--> Write a function to print the sum of all odd numbers from 1 to n
  public static int sumOddNumbers(int n){
    int sum = 0;
    for (int i = n; i >= 1; i--) {
      if(i%2!=0){
        sum = sum + i;
      }
    }
    return sum;
  }
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number : ");
   int n = sc.nextInt();
   int sum = sumOddNumbers(n);
   System.out.println("Sum of odd numbers from 1 to " + n + " is : "+sum);
  }  
}
