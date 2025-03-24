class javapractice1{
    public static void AddNum(int num1, int num2){
       System.out.println(num1 +num2);
    }
    public static void main(String[] args) {
        String name = new String("Nikhilesh");
        System.out.println(name);

        String lastName = "Tiwari";
        System.out.println(lastName);

       //Reversing the String
       String reverseName = "";

       for(int i = 0 ; i <= name.length()-1 ; i++){
        reverseName = reverseName + name.charAt(name.length()-1-i);
       }
       System.out.println(reverseName);


       //Counting Words 

       String newWord = "WorkSpaceStorage";
       System.out.println(newWord.length());

       //Adding Two Numbers 

       AddNum(20, 30);


       //Sum of Array Elements 

       int num[] = {30,40,60,90,03};
       System.out.println(num[4]);


       int sum  = 0;

       for(int i = 0 ; i < num.length ; i++){
        sum = sum + num[i];
       }
       System.out.println(sum);
    }
} 