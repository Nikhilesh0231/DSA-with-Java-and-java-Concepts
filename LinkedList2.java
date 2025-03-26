public class LinkedList2 {
    Node head; // Declare the head of the list
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        list.addLast("Magic");
        list.addLast("of Linked List");
        list.printList();
    }
}
