class StringRecap{
    public static void main(String[] args) {
         
        String string = new String();
        string = "Nikhilesh";
        System.out.println(string);
        string.concat("Hello");
        System.out.println(string);//String is not mutable
        
        StringBuilder string1 = new StringBuilder("Hello");
        System.out.println(string1);
        string1.append("World");
        System.out.println(string1);
    }
}