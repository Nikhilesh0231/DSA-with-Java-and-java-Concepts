
import java.util.Scanner;

public class Question5 {
  //Question--> Enter 3 numbers from user & make fuction to print their average.
  public static int average(int num1,int num2, int num3){
    int sum = num1 + num2 + num3;
    int avg = sum/3;
    return avg;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number : ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number : ");
    int num2 = sc.nextInt();
    System.out.print("Enter third number : ");
    int num3 = sc.nextInt();
    int avg = average(num1,num2,num3);
    System.out.println("Average of three numbers is : "+avg);
sc.close();

  }
}
