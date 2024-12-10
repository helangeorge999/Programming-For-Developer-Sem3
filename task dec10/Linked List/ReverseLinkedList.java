class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    // Function to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null;  // Previous node, initially null
        Node current = head;  // Current node starting at head
        Node next;  // To store the next node

        while (current != null) {
            next = current.next;  // Save the next node
            current.next = prev;  // Reverse the link
            prev = current;       // Move prev to current node
            current = next;       // Move to the next node
        }

        return prev;  // New head of the reversed list
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

        // Reverse the linked list
        head = reverse(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
