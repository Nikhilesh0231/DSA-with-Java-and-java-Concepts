import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        
        //Adding Element at the starting
        list.addFirst(0);
        System.out.println(list);


        //Removing Element at the ending
        list.addLast(5);
        System.out.println(list);



        //Removing Element from the starting
        list.removeFirst();
        System.out.println(list);


        //Removing Element from the ending
        list.removeLast();
        System.out.println(list);

        //Accessing Element from begining
        System.out.println(list.getFirst());

        
        //Accessing Element from last
        System.out.println(list.getLast());

        //Accessing list size
        System.out.println(list.size());


        //Iterating over an linked list

        for ( int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }    
}
