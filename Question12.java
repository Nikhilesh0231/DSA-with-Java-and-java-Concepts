
import java.util.Scanner;

public class Question12 {
  //Question -->Write a program to print Fibonacci series of n terms where n is input by user :
  // 0 1 1 2 3 5 8 13 21 ..... 
  // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms you want in the Fibonacci series : ");
    int n = sc.nextInt();
    int a = 0, b = 1, c = 0;
    System.out.print("Fibonacci Series : "+a+" "+b+" ");
    for(int i=2; i<n; i++) {
      c = a + b;
      System.out.print(c+" ");
      a = b;
      b = c;
    }
    sc.close();

  }
}
