public class Operators2 {
  public static void main(String[] args) {
    int a = 10 , b = 20;
    //Relational Operators
    System.out.println("a == b : "+(a == b));//false
    System.out.println("a != b : "+(a != b));//true
    System.out.println("a < b : "+(a < b));//true
    System.out.println("a > b : "+(a > b));//false
    System.out.println("a >= b : "+(a >= b));//false
    System.out.println("a <= b : "+(a <= b));//true


    //Logical Operators
    // And Operator both true
    System.out.println("a > b && a < b : "+(a > b && a<b));
    //Or operator Any true
    System.out.println("a > b || a < b : "+(a > b || a<b));
    //Not operator
    System.out.println("! (a > b) : "+! (a > b));//Its original result will be false because not operator  reverse the result it will results true
  }
}
