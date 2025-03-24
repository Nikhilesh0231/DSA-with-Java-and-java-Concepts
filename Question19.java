
import java.util.Scanner;

public class Question19 {
  //Question->Take a matrix as input from the user.Search for agivrn number x and print the indices at which it occurs.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows in the matrix: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns in the matrix: ");
    int columns = sc.nextInt();
    int[][] matrix = new int[rows][columns];
    System.out.println("Enter the elements of the matrix: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("Enter the element"+"("+i+","+j+")"+"of matrix : ");
        matrix[i][j] = sc.nextInt();
        }
      } 
    System.out.print("Enter the element that you want to search for the indices : ");
    int x = sc.nextInt();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (matrix[i][j] == x) {
          System.out.println("The element "+x+" is found at the indices ("+i+","+j+")");
        }
      }
    }
    sc.close();

  }
}
