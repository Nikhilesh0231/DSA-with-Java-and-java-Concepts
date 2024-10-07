import java.util.Scanner;
public class Question4 {
//Question:Print the table of a Number input by the user.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to get the table : ");
    int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " * " + i + " = " + n * i);
    }
  }  
}
