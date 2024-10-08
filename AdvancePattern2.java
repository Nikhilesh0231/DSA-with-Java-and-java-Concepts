public class AdvancePattern2 {
  public static void main(String[] args) {
    //Print the Pattern --> Solid Rhombus
    /*
             ****** 
            ******
           ******
          ******
         ******
     */
    System.out.println("Printing The Solid Rhombus Pattern");
    for(int i = 1 ; i <= 5 ; i++){
      for(int j = 1 ; j <= 5 - i ; j++){
        System.out.print("  ");
      }
      for(int k = 1 ; k <= 6 ; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
    //Print the Pattern --> Hollow Rhombus
    /*
             ****** 
            *    *
           *    *
          *    *
         ******
     */ 
    System.out.println("Printing The Hollow Rhombus Pattern");
    for(int i = 1 ; i <= 5 ; i++){
      for(int j = 1 ; j <= 5 - i ; j++){
        System.out.print("  ");
      }
      for(int k = 1 ; k <= 6 ; k++){
        if(i==1||i==5||k==1||k==6){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
