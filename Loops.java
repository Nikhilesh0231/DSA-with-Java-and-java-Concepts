public class Loops {
 public static void main(String[] args) {
  //For Loop-----//Syntax
  // for (initialization; condition; increment/decrement) {
  // //do Something
  // }
  for(int i = 1;i<=3;i++){
    if(i==1){
      System.out.println("Inside For Loop");
    }
    System.out.println("Hello World!!!");
  }
  //Printing Numbers From 1 to 10
  for (int i =1 ;i<=10;i++){
    if(i==1){
      System.out.println("Inside For Loop");
    }
    System.out.print(i+" ");
  }


  //While loop ----//Syntax
  // while(condition){
  // //do Something
  // }
  int i = 1;
  while(i<=10){
    if(i==1){
      System.out.println("\nInside While Loop");
    }
    System.out.print(i + " ");
    i++;
  }
  //Do-While Loop-----//Syntax
  // do{
  // //do Something
  // }
  //while(condition);
  int count = 1;
  do { 
      if (count==1) {
        System.out.println("\nInside Do-While Loop");
      }
      System.out.print(count+" ");
      count++;
  } while (count<=10);
 } 
}
