class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindMiddleNode {

    // Function to find the middle node
    public static Node findMiddle(Node head) {
        if (head == null) {
            return null; // If the list is empty, return null
        }

        Node slow = head; // Slow pointer
        Node fast = head; // Fast pointer

        // Traverse the list
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by one step
            fast = fast.next.next; // Move fast by two steps
        }

        return slow; // Slow pointer is now at the middle node
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);
