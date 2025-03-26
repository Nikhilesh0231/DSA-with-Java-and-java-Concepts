import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        // Queue = FIFO data structure. First In First Out.(Ex. A row of people purchasing
        // tickets at the airport)
        //A collectipon designed for holding elements priorto processing Linear Data Structure.
        //   add = enqueue,offer()
        //   remove = dequeue,poll()

        // Queue<String> ProgrammingLanguages = new Queue<String>();//we can not created queue like this
        //beacuse in collection queue in not stored as class its stored as an interface so we can create 
        // object for the same.

           Queue<String> PeoplesInARow =new LinkedList<String>();

           System.out.println(PeoplesInARow.isEmpty());

           PeoplesInARow.offer("Nikhilesh");
           PeoplesInARow.offer("Veeru");
           PeoplesInARow.offer("Ripunjay");
           PeoplesInARow.offer("Neelesh");

           //As it queue is interface implemented from collection class so queue has some collection methods
           System.out.println(PeoplesInARow.isEmpty());
           System.out.println(PeoplesInARow.size());
           System.out.println(PeoplesInARow.contains("Nikhilesh"));

           System.out.println(PeoplesInARow);
           System.out.println(PeoplesInARow.peek());//Nikhilesh
           System.out.println(PeoplesInARow.poll());
           System.out.println(PeoplesInARow);
    }
}
