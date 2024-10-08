public class AdvancePattern5 {
  public static void main(String[] args) {
  //Print the pattern --> Diamond Pattern
  /*
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
  */
  System.out.println("Printing The Diamond Pattern");
  for(int i=1;i<=5;i++){
    for(int j=1;j<=5-i;j++){
      System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
      System.out.print("* ");
    }
    System.out.println();
  }
  for(int i=1;i<=5;i++){
    for(int j=i;j>=1;j--){
      System.out.print(" ");
    }
    for(int k=1;k<=5-i;k++){
      System.out.print("* ");
    }
    System.out.println();
  }
 }
}
