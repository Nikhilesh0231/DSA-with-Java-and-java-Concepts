
import java.util.Scanner;

public class TwoDArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows of numbers matrix : ");
    int rows = sc.nextInt();
    System.out.print("Enter the columns of numbers matrix : ");
    int columns = sc.nextInt();
    int[][] numbers = new int[rows][columns];
    System.out.println("Enter the each element of the numbers  : ");
    for(int i = 0 ; i < rows; i++){
      for(int j = 0; j < columns; j++){
        System.out.print("Enter the " +"("+ i+","+j+") "+ "element : ");
        numbers[i][j] = sc.nextInt();
      }
    }
    System.out.println("Each element of the numbers are : ");
    for(int i = 0 ; i < rows; i++){
      for(int j = 0; j < columns; j++){
        System.out.print("The "+"(" + i+","+j+ ") "+"element is : ");
        System.out.println(numbers[i][j]);
      }
    }
    System.out.println("Numbers element in the matrix form are : ");
    for(int i = 0 ; i < rows; i++){
      for(int j = 0; j < columns; j++){
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
  }  
}
