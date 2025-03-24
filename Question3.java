import java.util.Scanner;
//Question--> Print the sum of first n natural numbers.
public class Question3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to get the sum from 1 to the number,number given by you : ");
    int num = sc.nextInt();
    int sum = 0;
    for(int i = 1;i<=num;i++){
      sum = sum + i;
    }
    System.out.println("Sum of first "+num+" natural numbers is : "+sum);
sc.close();

  }  
}
