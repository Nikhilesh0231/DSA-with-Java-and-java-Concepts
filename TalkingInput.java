import java.util.*;
public class TalkingInput {
  public static void main(String[] args) {
    // Input
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name:");
      String name = sc.nextLine();
      //nextLine() --> input whole sentence
      //next() --> input one word
      //nxtInt --> input integer
      System.out.println("Hello, " + name + "!");

  }
  
}
