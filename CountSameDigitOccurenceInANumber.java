import java.util.Scanner;

public class CountSameDigitOccurenceInANumber {
    public static int countDigitOccurence(int Number ,int Digit){
        int count = 0;
        while(Number>0){
            if(Number%10  == Digit){
                count++;
            }
            Number /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int Number = sc.nextInt();
        System.out.print("Enter a Digit to be checked it's occurence : ");
        int Digit = sc.nextInt();

        int count = countDigitOccurence(Number,Digit);
        System.out.println("Digit "+Digit+" occurs "+count+" times in "+Number);
        sc.close();
    }
}
