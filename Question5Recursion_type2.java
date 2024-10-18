
public class Question5Recursion_type2 {
    //Question -> Print x^n( x to the power n).(Stack Height = logn)
    // x^n = x*x*x*x...ntimes
    //Two cases:-
    //1.x^0 = 1 
    //2. x = 0 

    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
//if n is even and else n is odd
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        }else{
          return x*printPower(x, n / 2) * printPower(x, n /2);
        }
    }

    public static void main(String[] args) {
        //  int result = printPower(2, 1);//2
        //  int result = printPower(0, 1);//0
        //  int result = printPower(2, 0);//1
        int result = printPower(2, 4);//16
        System.out.println(result);
    }
}
