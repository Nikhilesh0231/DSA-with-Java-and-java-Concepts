class AdvancePatterns1{
  public static void main(String[] args) {
    //Print the Pattern --> Butterfly Pattern
    /*    *             *
          * *         * *
          * * *     * * *         
          * * * * * * * *
          * * * * * * * *
          * * *     * * *
          * *         * *
          *             *
    */
    System.out.println("Printing The Buuterfly Pattern");
    for (int i = 1 ; i <= 4 ; i++){
      for(int j = 1 ; j <= i ; j++){
        System.out.print("* "); 
      }
      for(int j = 1 ; j <= 2*(4-i) ; j++){
        System.out.print("  ");
      }
      for(int j = 1 ; j <= i ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 4 ; i >= 1 ; i--){
      for(int j = 1 ; j <= i ; j++){
        System.out.print("* "); 
      }
      for(int j = 1 ; j <= 2*(4-i) ; j++){
        System.out.print("  ");
      }
      for(int j = 1 ; j <= i ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}