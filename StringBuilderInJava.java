public class StringBuilderInJava {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);

    //char at index 0
    System.out.println(sb.charAt(0));


    //set char at index
    sb.setCharAt(0, 'J');//it replaces t with j 
    System.out.println(sb);

    //Insert function
    sb.insert(0, "Hello ");//it inserts at the specified position
    System.out.println(sb);

    sb.insert(10,",how are you!!!");

    System.out.println(sb);


    //Delete Function
    // String.delete(starting index,Ending Index)
    StringBuilder sb1 = new StringBuilder("TonyStark");
    sb1.delete(0, 4);//Last Index will not be deleted
    System.out.println(sb1);
    

    //Append Function -> It adds the String at the last position
    StringBuilder sb2 = new StringBuilder("H");
    sb2.append("e");// in String we do like sb2 = sb2 + "e"
    sb2.append("l");// in String we do like sb2 = sb2 + "l"
    sb2.append("l");// in String we do like sb2 = sb2 + "l"
    sb2.append("o");// in String we do like sb2 = sb2 + "o"
    System.out.println(sb2);


    //length Function--> It returns the length of the String
    StringBuilder sb3 = new StringBuilder("Hello");
    System.out.println(sb3.length());
  }
}
