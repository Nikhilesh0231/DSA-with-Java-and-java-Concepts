import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
     
        Stack<String> Fruits = new Stack<String>();

        // System.out.println(Fruits.empty());//It return true if stack is empty otherwise false -> true
        Fruits.push("Apple");
        Fruits.push("Orange");
        // System.out.println(Fruits.empty());//-> false
        // System.out.println(Fruits);//[Apple, Orange]
        Fruits.push("Grapes");
        Fruits.push("Mango");

        // System.out.println(Fruits);
        // Fruits.pop();
        // Fruits.pop();
        // Fruits.pop();
        //Here We can see that Stack as Last in First out using push we can add element
        // and using pop method we can remove element lastly added in the stack
        //And Storesobject in sort of tower


        // System.out.println(Fruits);

        //Now suppose a case where we last fruit as my Fav fruit.

        // String myFavFruit = Fruits.pop();
        //once we store it then it will removed from Fruits Stack
        // System.out.println(Fruits);
        // System.out.println(myFavFruit);

        //Now Suppose a case where we want that last element as added as myFavSubject and not removed from the stack 
        //For this we can use Peek()

        String myFavFruit = Fruits.peek();
        System.out.println(Fruits);
        System.out.println(myFavFruit);

        //Now to Search For an element in the stack we can use seach method which return top most element as 1 and followed by this way
        // and item is not present in the stack it return -1
        // [Apple, Orange, Grapes, Mango]
        //    4      3       2      1
        System.out.println(Fruits.search("Apple"));//4 th from the Top
        System.out.println(Fruits.search("Litchi"));//-1
    }    
}
