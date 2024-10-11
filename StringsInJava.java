
import java.util.Scanner;

public class StringsInJava{
  public static void main(String[] args) {
    // Creating a string
    String str = "Hello, World!";
    String sentence = "This is file for Strings";
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name:");
    // String name = sc.next();// it take only one word as input but we cannot use next and nextLine in same code becauseif you next then nextLine will not executes 
    String name = sc.nextLine();
    System.out.print("Tell me about your self Mr."+name+" : ");
    String about = sc.nextLine();//It will take whole sentence as input.
    // System.out.println("Your name is : "+name);
    System.out.println("You said: "+about);
    
  }
}