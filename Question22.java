
import java.util.Scanner;

public class Question22 {
  //Question -> Reverse The String
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("HELLO");  
    for( int i = 0 ; i <sb.length()/2 ;i++){
      int front = i;
      int back = sb.length()-1-i;

      char frontChar = sb.charAt(front);
      char backChar = sb.charAt(back);

      sb.setCharAt(front, backChar);
      sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
    // System.out.println(sb.reverse());//it is a function to reverse the String
  }
}
