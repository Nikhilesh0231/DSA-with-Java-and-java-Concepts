public class StringFunctions2 {
  public static void main(String[] args) {
    // ParseInt Method of Integer class
    String str = "123";
    int number = Integer.parseInt(str);//It Changes String to number or integers
    System.out.println(number);
    System.out.println(number+1);


    // ToString Method of String class
    int number1 = 123;
    String str1 = Integer.toString(number1);//It Changes Integers to Strings
    System.out.println(str1.length());
  }
}
