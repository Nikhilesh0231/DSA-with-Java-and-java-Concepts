public class AdvancePattern3 {
  public static void main(String[] args) {
   //Print the pattern --> Number Pattern
   //     1
   //    2 2
   //   3 3 3
   //  4 4 4 4
   // 5 5 5 5 5
   System.out.println("Printing The pattern Number Pyramid");
   for(int i = 1 ; i <= 5 ; i++){
    for(int j = 1 ; j <= 5-i ; j++){
      System.out.print(" ");
    }
    for(int j = 1 ; j <= i ; j++){
      System.out.print(i + " ");
    }
    System.out.println();
    }
  }
}
