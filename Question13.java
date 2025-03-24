
import java.util.Scanner;

public class Question13 {
  //Question-->Write a function that calculates the greatest common Divisor of two numbers.
  public static void greatestCommonDivisor(int num1, int num2){
    while(num1!=num2){
      if(num1>num2){
        num1=num1-num2;
      }
      else{
        num2=num2-num1;
      }
    }
    System.out.println("Greatest Common Divisor is " + num2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number : ");
    int num2 = sc.nextInt();
    greatestCommonDivisor(num1, num2);
    sc.close();

  }  
}
