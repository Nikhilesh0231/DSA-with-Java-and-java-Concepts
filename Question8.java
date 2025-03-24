
import java.util.Scanner;

public class Question8 {
  //Question-->Write a function that takes in age as input and return if that person is eligible to vote or not .A person of age > 18 is eligible to vote. 
  public static void voteEligibility(int age){
    if(age>18){
      System.out.println("You are eligible to vote");
    }
    else{
      System.out.println("You are not eligible to vote");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age : ");
    int age = sc.nextInt();
    voteEligibility(age);
    
    
sc.close();
  }
}
