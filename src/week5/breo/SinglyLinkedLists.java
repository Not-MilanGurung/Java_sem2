package week5.breo;

/**
 * A simple singly linked list class with attributes:
 * <ul>
 * <li>{@link #head Head node}</li>
 * <li>{@link #last Last node}</li>
 * </ul>
 */
public class SinglyLinkedLists {
    /** Head node of the Linked List object */
    public Node head;
    /** Last node of the Linked List object */
    public Node last;
    /**
     * Node class for the linked list. Has attribute:
     * <ul>
     * <li>{@link #data}</li>
     * <li>{@link #next} - Reference to next node</li>
     * </ul> 
     */
    static class Node {
        int data;
        Node next;
        /**
         * Construts a node with next node as null
         * @param data Data value of the node
         */
        Node(int data) {this.data = data;}
    }
    /**
     * Constructs a object with data for the head node
     * @param firstData Data for the first node
     */
    public SinglyLinkedLists(int firstData){
        this.head = new Node(firstData);
        this.last = this.head;
    }
    /**
     * Inserts a new node at the end
     * @param data Data of the new node
     */
    public void append(int data){
        Node newNode = new Node(data);
        this.last.next = newNode;
        this.last = newNode;
        printList();
    }

    /**
     * Inserts a new node at the beginning
     * @param data Data of the new node
     */
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        printList();
    }
    /**
     * Insert a new node with the data into the list at defined position
     * @param data Data value of the new node
     * @param position Position to insert into, starts at 0
     * @return true if insertion was succesfull, false otherwise
     */
    public boolean insertAtPosition(int data, int position){
        // Negative position insertion error
        if (position < 0) {
            System.out.println("Error: negative position is not allowed");
            return false;
        }
        // Insertion at the start
        if (position == 0){ 
            insertAtStart(data);
            return true;
        }

        Node curNode = this.head; // Reference to current node, intilised as the head
        Node prevNode = null; // Reference to previous node
        // Looping from head to the last
        for(int i = 0; curNode != null; i++){
            // If the given position is reached insert a new node with the given value at that position
            if (i == position) {
                Node newNode = new Node(data);
                prevNode.next = newNode; // Insert the new node behind the previous node
                newNode.next = curNode; // Push the current node behind the new node
                printList();
                return true;
            }
            prevNode = curNode; // Set current node to be the previous node for the next itteration
            curNode = curNode.next; // Itterate to the next node
        }
        // When the position is bigger than the no. of nodes in the list
        System.out.println("Position out of index!");
        printList();
        return false;
    }
    /**
     * Prints the data of all the nodes in the list, sequentiually from head to last
     */
    public void printList(){
        Node curNode = this.head;
        System.out.print("[ ");
        while (curNode != null){
            System.out.print(curNode.data);
            if (curNode.next != null){ System.out.print(", ");}
            curNode = curNode.next;
        }
        System.out.println("]");
    }
    /**
     * Reverses the linked list itterativerly
     */
    public void reverse(){
        Node curNode = this.head, prevNode = null, nextNode;
        
        while (curNode != null) {
            nextNode = curNode.next;
            curNode.next = prevNode;

            prevNode = curNode;
            curNode = nextNode;
        }
        this.last = this.head;
        this.head = prevNode;
        printList();
    }
    /**
     * Reverses the linked list recursively by using the method {@link #revRec(Node)}
     */
    public void reverseRecursive(){
        this.last = this.head;
        this.head = revRec(this.head);
        printList();
    }
    /**
     * Recursive method that reverses the list using the head node and returns the new head 
     * @param head 
     * @return  New head
     */
    Node revRec(Node head){
        // If the list is empty or the end has been reached
        if (head == null || head.next == null) return head;
        // Recursively reverse the rest of the nodes
        Node rest = revRec(head.next);
        // Reverse the head node
        head.next.next = head;
        head.next = null;

        return rest;
    }

    /**
     * Testing out the methods of {@link SinglyLinkedLists}
     * @param args Default main function args
     */
    public static void main(String[] args) {
        SinglyLinkedLists marks = new SinglyLinkedLists(43);
        
        marks.append(23);
        marks.append(56);
        marks.append(97);
        marks.append(86);

        marks.insertAtStart(55);

        marks.insertAtPosition(76, 2);
        long startTime = System.nanoTime();
        marks.reverse();
        long stopTime = System.nanoTime();
        System.out.println("Itterative execution time:"+(stopTime - startTime));

        startTime = System.nanoTime();
        marks.reverseRecursive();
        stopTime = System.nanoTime();
        System.out.println("Itterative execution time:"+(stopTime - startTime));
    }
}
