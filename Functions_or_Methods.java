import java.util.Scanner;

class Functions_or_Methods{
  //Syntax --> Function
  // returnType functionName(type arg1,type arg2 ...) {
  // operations
  //  }
  // 1.Function is a block of code which can be called many times from our program.
  // 2.Function is a reusable block of code which can be called many times from our program.
  // 3.Function is a block of code which can be executed many times from our program.


//Print a given name in function
  public static void printMyName(String name){
    System.out.println("Your name is "+name+".\nWelcome "+name+"!!!");
    return;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name :");
    String name = sc.nextLine();
    printMyName(name);//Calling Function
sc.close();

  }
}