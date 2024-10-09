
import java.util.Scanner;

public class Factorial {
  public static int Factorial(int num){
    int fact = 1;
    for(int i = num; i >= 1; i--){
      fact = fact * i;
    }
    return fact;
  } 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int fact = Factorial(num);
    System.out.println("Factorial of "+num+" is: "+fact);
  }  
}
