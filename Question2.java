
import java.util.Scanner;

public class Question2 {
//Take 2 variables 'a' and  'b'  and print their sum 
public static void main(String[] args) {
  int a,b,sum;
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the value of a : ");
  a = sc.nextInt();
  System.out.print("Enter the value of b : ");
  b = sc.nextInt();
  sum = a + b ;
  System.out.println("Sum of a and b is : " + sum);
}
}