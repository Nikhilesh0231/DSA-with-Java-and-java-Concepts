import java.util.Scanner;

public class Question7 {
  //Question --> Write a function that takes in the radius as input and returns the circumference of a circle.
  public static double calcCircumference(double r){
    return 2*3.14*r;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of the circle:");
    double radius = sc.nextDouble();
    double circumference = calcCircumference(radius);
    System.out.println("The circumference of the circle is: "+circumference);
  }
}
