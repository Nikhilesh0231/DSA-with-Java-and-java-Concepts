class Question3Recursion{
  //Question -> Factorial of a number n
  public static int Fact(int n) {
    if(n==1|| n == 0){
      return 1;
    }
   int fact = n;
   fact = n * Fact(n-1);
   return fact;
  }
  public static void main(String[] args) {
    int result = Fact(5);
    System.out.println(result);
  }
}