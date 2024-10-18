public class Question4Recursion {
  //Question-> Print the fibonacci series till nth term.
  public static void Fibonacci(int a, int b ,int n){
    if(n==0){
      return;
    }
    int c = a + b;
    System.out.print(" " + c);
    Fibonacci(b, c, n-1);
  }
  public static void main(String[] args) {
    int a = 0 ;
    int b = 1 ;
    System.out.print(a + " " +  b);
    Fibonacci(a, b, 8);//n= 10 but 0 1 is 2 terms 
  }
}
