
import java.util.Scanner;

public class Question16 {
//Question -->Take an array of names as input from the user and print them on the screen.
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number of names you want to enter : ");
  int size = sc.nextInt();
  String names[]= new String[size];
  System.out.println("Enter the names : ");
  for(int i = 0 ; i < names.length ; i++){
    names[i] = sc.next();
  }
  System.out.print("Names are : ");
  for(int i = 0 ; i < names.length ; i++){
    System.out.print((i+1)+"."+names[i] + " ");
  }
}
}
