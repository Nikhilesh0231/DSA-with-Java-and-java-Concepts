
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    System.out.print("Enter :\n1.For Addition press 1\n2.For Subtraction press 2\n3.For Multiplication press 3\n4.For Division press 4\n---->");
    int choice = sc.nextInt();
    int sum = num1+num2;
    int mul = num1*num2;
    int div = num1/num2;
    int sub = num1-num2;
    switch (choice) {
      case 1:
      System.out.println("Addition of " + num1 + " and " + num2 + " is :" + sum);
      break;
      case 2:
      System.out.println("Subtraction of " + num1 + " and " + num2 + " is :" + sub);
      break;
      case 3:
      System.out.println("Multiplication of " + num1 + " and " + num2 + " is :" + mul);
      break;
      case 4:
      System.out.println("Division of " + num1 + " and " + num2 + " is :" + div);
      break;
      default:
      System.out.println("Invalid choice");
    }
    sc.close();

  }
}
