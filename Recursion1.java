class Recursion1{
  public static void printNumbers(int n){
    if(n == 0) {
      return ;
    }
    System.out.println(n + " ");
    printNumbers(n-1);
  }
  public static void main (String args[]){
    //Print 5 Numbers from 5 to 1
    printNumbers(5);
  }
}