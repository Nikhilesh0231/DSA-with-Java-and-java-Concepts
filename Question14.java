
import java.util.Scanner;

public class Question14 {
  //Question-->Write a function which takes in 2 numbers and returns the greater of those two .
  public static int greatestOfTwo(int num1,int num2){
    if(num1>num2){
      return num1;
    }
    else{
      return num2;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number : ");
    int num2 = sc.nextInt();
    System.out.println("The greatest of two numbers is : "+greatestOfTwo(num1,num2));
  }
}
