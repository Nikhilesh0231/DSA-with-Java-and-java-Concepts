import java.util.Scanner;

public class AddTwoNumbers {
  public static int addNum(int num1,int num2){
    int sum ;
    sum = num1 + num2 ;
    return sum ;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    int sum = addNum(num1,num2);
    System.out.println("Sum of two numbers is: "+sum);
  }  
}
