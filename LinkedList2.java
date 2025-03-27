public class LinkedList2 {
    Node head; // Declare the head of the list
    private int size;

    LinkedList2(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //Adding data to the list 
    // Adding From last Adding from  first;

    public void addFirst(String data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //Printing List
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    //delete First

    public void deleteFirst(){
        if(head == null) {
            System.out.println("The List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete Last

    public void deleteLast(){
        if(head == null) {
            System.out.println("The List is Empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;


        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //getting size 

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        list.addLast("Magic");
        list.addLast("of Linked List");
        System.out.println(list.getSize());
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());


    }
}
