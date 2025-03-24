import java.util.Scanner;

public class Toggle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        sc.close();
        StringBuilder togggleStr = new StringBuilder();
        char[] strCharArr = str.toCharArray();
        int lengthOfStrCharArr = strCharArr.length;
        for(int i = 0; i < lengthOfStrCharArr;i++){
            char charToBeCheck = strCharArr[i];
            if(Character.isUpperCase(charToBeCheck)){
                togggleStr.append(Character.toLowerCase(charToBeCheck));
            }
            else if(Character.isLowerCase(charToBeCheck)){
                togggleStr.append(Character.toUpperCase(charToBeCheck));
            }
            else{
                togggleStr.append(charToBeCheck);
            }
        }
        System.out.println(togggleStr);
    }
}