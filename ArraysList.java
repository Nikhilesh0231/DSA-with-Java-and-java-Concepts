import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {
   public static void main(String[] args) {
    ArrayList<Integer> Numbers = new ArrayList<Integer>();


    //Adding Elements
    Numbers.add(0);
    Numbers.add(2);

    System.out.println(Numbers);

    //getting Element
   int num =  Numbers.get(0);
    System.out.println(num);
    
    //Add element in between 
    Numbers.add(1, 1);
    System.out.println(Numbers);

    //Updating Element by new Element
    Numbers.set(0,1);
    Numbers.set(1,2);
    Numbers.set(2,3);
    System.out.println(Numbers);

    //Deleting Element

    Numbers.remove(0);
    System.out.println(Numbers);
    // Numbers.clear();
    // System.out.println(Numbers);

    //To know the size of array List 
    int size = Numbers.size();
    System.out.println(size);

    Numbers.add(0,1);
    Numbers.add(4);
    Numbers.add(5);

    int newSize = Numbers.size();

    //Looping

    for( int i = 0 ; i < newSize ; i++){
        int element = Numbers.get(i);
        System.out.println(element);
    }

    //Sorting

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(5);
    list.add(2);
    list.add(15);
    list.add(52);
    list.add(25);
    
    Collections.sort(list);
    System.out.println(list);

} 
}
