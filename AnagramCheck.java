import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String str2 = sc.nextLine();
        sc.close();

        if (isAnagram(str1, str2))
            System.out.println("The Strings are anagram.");
        else {
            System.out.println("The Strings are not anagrams.");
        }
    }
}
