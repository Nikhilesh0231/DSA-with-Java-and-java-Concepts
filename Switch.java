
import java.util.Scanner;
//Switch Syntax
// Switch(variable){
// case1 : stt1;
//         break;
// case2 : stt1;
//         break;
// case3 : stt1;
//         break;
// default: stt4;
// }

public class Switch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter : \n 1.For Namaste \n 2.For Hello \n 3.For Bonjour \n -----> ");
    System.out.print("Enter a number either 1,2 or 3: ");
    int n = sc.nextInt();
    switch(n){
      case 1:
      System.out.println("Namaste");
      break;
      case 2:
      System.out.println("Hello");
      break;
      case 3:
      System.out.println("Bonjour");
      break;
      default:
      System.out.println("Invalid Input");
    }
  }
}
