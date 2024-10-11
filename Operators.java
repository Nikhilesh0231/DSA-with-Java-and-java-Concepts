public class Operators {
  public static void main(String[] args) {
    int a = 20; 
    int b = 10;
    // Airthmetic Operators
    // --> Binary Operators
    System.out.println("Value of a+b = "+(a+b));
    System.out.println("Value of a-b = "+(a-b));
    System.out.println("Value of a-b = "+(a*b));
    System.out.println("Value of a-b = "+(a/b));
    System.out.println("Value of a-b = "+(a%b));
    //-->Unary Operator
    //Pre Increment
    System.out.println("Value of ++a = "+(++a));//21
    //Post Increment
    System.out.println("Value of a++ = "+(a++));//21
    System.out.println("Value of a = "+(a));//22
    //Pre decement
    System.out.println("Value of --b = "+(--b));//9
    //post decrement
    System.out.println("Value of b-- = "+(b--));//9
    System.out.println("Value of b = "+(b));//8
  }
}
