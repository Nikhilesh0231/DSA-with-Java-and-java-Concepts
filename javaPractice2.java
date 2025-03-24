import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class javaPractice2 {

    //Method to Calculate Area of Rectangle

    static void AreaOfRecatangle(int length,int breadth){
        int Area = length * breadth;
        System.out.println(Area);
    }

    public static void main(String[] args) {
        //Converting String to Array

        String myStr = "Hello Java";
        char [] myChar = myStr.toCharArray();

        for (char c : myChar) {
            System.out.println(c);
        }

        //Sorting Over an Array

        int myNum[] = {1,5,2,4,13,5,3,423,655,668,32,6,6,74,23,687,89};
        Arrays.sort(myNum);
        for (int i : myNum) {
            System.out.println(i);
        }


        //Calculating Average of the Array Elements
        int sum = 0;

        for(int i = 0 ; i < myNum.length ; i++){
            sum += myNum[i];
        } 
        System.out.println(sum);
        System.out.println(myNum.length);
        float Average = sum/myNum.length;
        System.out.println(Average);

        //Find smallest Element in the Array

        int newArr [] = {323,232,231,123,432,452,121,213,233,321,452,231,453,122,234,111};

        int smallestInArray = newArr[0];

        for(int i = 1 ; i < newArr.length ; i++){
            if (newArr[i]<smallestInArray) {
                smallestInArray = newArr[i];
            }
        }
        System.out.println(smallestInArray);

        //Area Of Rectangle

        AreaOfRecatangle(25,40);


        //Even and Odd


        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        // int Number= 25;
        if(Number%2 == 0){
            System.out.println(Number + " is Even");
        }
        else{
            System.out.println(Number + " is Odd");
        }


        //Positive and Negative

        if(Number > 0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Negative");
        }


        //Square Root of the Number


        System.out.println(Math.sqrt(Number));

        //Generating Random Number between  1 to 100 

        double randomNumber = Math.floor(Math.random()*100+1);
        System.out.println(randomNumber);
        

        sc.close();
    }
}
 