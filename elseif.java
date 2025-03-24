
import java.util.Scanner;

public class elseif {
    //Syntax for elseif 

    /* if(Condition1){
   *       stt1;
   *       stt2
   *     }
   * elseif(Condition2){
   *        stt3;
   *        stt4
   *    }
   *  else{
   *        stt5;
   *        stt6;
   *    }
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //Take two user input of num1 and num2 and then check for num1 = num2 and num1 > num2 and num2 > num1.
      System.out.print("Enter first number : ");
      int num1 = sc.nextInt();
      System.out.print("Enter second number : ");
      int num2 = sc.nextInt();
      if (num1 == num2) {
        System.out.println("Both numbers are equal");
      } else if (num1 > num2) {
        System.out.println("First number is greater");
      } else {
        System.out.println("Second number is greater");
      }
      
      System.out.print("Enter : \n 1.For Namaste \n 2.For Hello \n 3.For Bonjour \n -----> ");
      int button = sc.nextInt();
      if(button < 3 && button > 0){
        if(button == 1){
          System.out.println("Namste!!!");
        }
        else if(button == 2){
          System.out.println("Hello!!!");
        }
        else{
          System.out.println("Bonjour!!!");
        }
      }
      else {
        System.out.println("Invalid Button Code");
      }
sc.close();

    }
}
