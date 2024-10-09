
import java.util.Scanner;

public class Question11 {
  //Question-->Two numbers are entered by the user , x and n .Write a function to find the value of a number raised to power of another i.e. x to the power n.
  public static void numberRaisedToPower(int base,int power){
    if(power == 0){
      int result = 1;
      System.out.println("The result is : " + result);
    }
    else if(power < 0){
      System.out.println("Please Enter the positive power");
    }
    else{
      int result2 = base;
      if(power==1){
        result2 = base;
      }else{
        for(int i = 2 ; i<=power;i++){
          result2 = result2 * base;
        }
      }
      System.out.println("The result is : " + result2);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base number : "); 
    int base = sc.nextInt();
    System.out.print("Enter the power : ");
    int power = sc.nextInt();
    numberRaisedToPower(base,power);
  }  
}
