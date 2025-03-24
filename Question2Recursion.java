
import java.util.Scanner;

public class Question2Recursion {
//Question -> Print Sum of first n natural numbers.
    public static int printSum(int n) {
      int sum = 0;
      if (n == 0) {
        return 0;
      }
      sum = n + printSum(n - 1);
      return  sum ;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int n = sc.nextInt();
     int result = printSum(n);
     System.out.print("The sum of first n natural numbers is : " + result);
sc.close();

    }
}
