
import java.util.Scanner;

public class StringFunction {

    public static void main(String[] args) {
        //Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String fullname = str1 + " " + str2;
        System.out.print(fullname);

        //Length
        int length = fullname.length();
        //Hello World
        System.out.println("\nLength of the String is " + length);

        //charAt
        String str3 = "Nikhilesh";
        for (int i = 0; i < str3.length(); i++) {
            System.out.println("Character at " + (1 + i) + " is : " + str3.charAt(i) + " ");
        }




        //compare -> it compare the first char and check for the alphabet number the higher the number the greater will String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str4 = sc.nextLine();
        System.out.print("Enter the second String : ");
        String str5 = sc.nextLine();

        //Str4 > str5 : +ve value
        //Str4 == str5 : 0
        //Str4 < str5 : -ve value
        if (str4.compareTo(str5) == 0) {
            System.out.println("Both Strings are Equal");
        } else if (str4.compareTo(str5) > 0) {
            System.out.println("first is greater than second");
        } else {
            System.out.println("second is greater than first");
        }

        //We can also do the same thing like this but this may fail in some cases 
        //int this case we get equal 
        String name1 = "Tony";
        String name2 = "Tony";
        if (name1 == name2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        //this fails like this 
        //because both the strings are pointing to the same memory location
        //in this case we get not equal still our both string like in our previous case.
        if (new String("Tony") == new String("Tony")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }



    //SubString ->This is function to get a part of String from a given String.
    //It takes two parameters, the first parameter is the string from which we want to get the
    //substring and the second parameter is the starting index of the substring.
    //The substring starts from the starting index and goes till the end of the string.
    String sentence = "My name is Tony";//n is at index 3 because index start from 0
    //substring(starting index,ending index)
    String sub = sentence.substring(3,8);//Last index number will not included.
    String sub1 = sentence.substring(11);//in this case last index will not neccessary to pase as it goes to the length of the string
    System.out.println(sub); //output : name.
    System.out.println(sub1); //output : name.


  //Strings are Immutable-> it means if we can declare any String then we can not modifiy it.
  sc.close();

  }
}
