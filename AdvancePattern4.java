public class AdvancePattern4 {
  public static void main(String[]args){
   //Print The Pattern ---> Palindromin Pattern
   //        1
   //      2 1 2
   //    3 2 1 3 2
   //  4 3 2 1 3 2 1
   //5 4 3 2 1 2 3 4 5
   System.out.println("Printing the Palindromic Pattern");
   for( int i = 1 ; i <= 5 ; i++){
    for(int j = 1 ; j <= 5-i ; j++){
      System.out.print("  ");
    }
    for( int j = i ; j > 0 ; j--){
      System.out.print(j+" ");
    }
    // if(i==1){
    //   System.out.print("");
    // }else{
    //   for(int j = 2 ; j <= i ; j++){
    //     System.out.print(j+" ");
    //   }
    // }
    for(int j = 2 ; j <= i ; j++){
     System.out.print(j+" ");
    }
    System.out.println();
   }
  }
}
