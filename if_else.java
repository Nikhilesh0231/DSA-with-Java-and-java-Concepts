
import java.util.*;

public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Checking the entered age is adult or not!
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        // Checking the entered number is even or odd!
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        //Take two user input of num1 and num2 and then check for num1 = num2 and num1 > num2 and num2 > num1.
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Both numbers are equal");
        } else {
            if (num1 > num2) {
                System.out.println("First number is greater");
            } else {
                System.out.println("Second number is greater");
            }
        }
        sc.close();

    }
}
