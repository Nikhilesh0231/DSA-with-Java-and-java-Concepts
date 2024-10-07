public class Patterns {
  public static void main(String[] args) {
   //Print the pattern--Solid Rectangle
   //   *********
   //   *********
   //   *********
   //   *********
   System.out.println("Solid Rectangle");
   for (int i = 1; i < 5; i++) {
    for (int j = 1; j < 7; j++) {
     System.out.print("* ");
    }
    System.out.println();
    }
   //Print the pattern--Hollow Rectangle
   //   *********
   //   *       *
   //   *       *
   //   *********
   System.out.println("\nHollow Rectangle");
   for (int i = 1; i < 6; i++) {
    for (int j = 1; j < 8; j++) {
     if (i == 1 || i == 5 || j == 1 || j == 7) {
      System.out.print("* ");
     } else {
        System.out.print("  ");
        }
    }
    System.out.println();
   }
   //Print the Pattern --> Add Symbol
   //        *
   //        *
   //   * * * * * *
   //        *
   //        *
   System.out.println("\nAdd Symbol");
   for (int i = 1; i < 6; i++) {
    for (int j = 1; j < 6; j++) {
     if (j == 3 || i == 3) {
      System.out.print("* ");
      } else if (j == 1 || j == 2) {
          System.out.print("  ");
      } else {
          System.out.print(" ");
      }
     }
    System.out.println();
  }
  //Print The Pattern -- > Half Pyramid
  //     *
  //     * *
  //     * * *
  //     * * * *
  //     * * * * *
  System.out.println("\nHalf Pyramid");
  for (int i = 1; i < 6; i++) {
   for(int j = 1 ; j <= i ; j++){
    System.out.print("* ");
   }
   System.out.println();
  }
  //Print The Pattern --> Inverted half pyramid
  //     * * * * *
  //     * * * *
  //     * * *
  //     * *
  //     *
  System.out.println("\nInverted Half Pyramid");
  for (int i = 1; i < 6; i++) {
    for(int j = 1 ; j < 6-i ; j++){
      System.out.print("* ");
    }
    System.out.println();
  }
  //Print The Pattern -->  Inverted Half Pyramid Roated by 180 deg
  //       *
  //     * *
  //   * * *
  // * * * *
  System.out.println("\nInverted Half Pyramid Roated by 180 deg");
  for (int i = 1; i < 6; i++) {
    for(int j = 1 ; j < 6-i ; j++){
      System.out.print("  ");
   }
   for(int k = 1 ; k <= i ; k++){
    System.out.print("* ");
   }
   System.out.println();
  }
//Print The Pattern --> Half Pyramid With Number
//     1 
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5
 System.out.println("\nHalf Pyramid With Number");
  for (int i = 1; i < 6; i++) {
    for(int j = 1 ; j <=i ;j++){
      System.out.print(j+" ");
    }
    System.out.println();
  }
//Print The Pattern --> Inverted Half Pyramid With Numbers
//     1 2 3 4 5
//     1 2 3 4
//     1 2 3
//     1 2
//     1
System.out.println("\nInverted Half Pyramid With Numbers");
 for (int i = 1;i<6;i++){
  for(int j = 1;j<=6-i;j++){
    System.out.print(j+" ");
  }
  System.out.println();
 }
//Print The Pattern --> Flyod's Triangle
//        1
//        2 3
//        4 5 6
//        7 8 9 10
System.out.println("\nFlyod's Triangle");
int num = 1;
for(int i = 1 ; i < 6 ;i++){
  for(int j = 1 ; j <= i;j++){
   System.out.print(num+" ");
   num++;
  }
  System.out.println();
}
//Print The Pattern ----> 0-1 Triangle
//        1
//        0 1
//        1 0 1
System.out.println("\n0-1 Triangle");
int num1 = 1;
for(int i = 1 ; i < 6 ;i++){
  for(int j = 1 ; j <= i;j++){
    if((i+j)%2==0){
      System.out.print(1+" ");
    }
    else{
      System.out.print(0+" ");
    }
   }
   System.out.println();
  }
 }
}
