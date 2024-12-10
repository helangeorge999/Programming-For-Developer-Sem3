class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicates {

    // Function to remove duplicates from a sorted linked list
    public static Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head; // No duplicates if the list is empty or has only one node
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                // Remove the duplicate node
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head; // Return the modified list
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
        // Create a sample sorted linked list: 1 -> 1 -> 2 -> 3 -> 3
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original Linked List:");
        printList(head);

        // Remove duplicates
        head = removeDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        printList(head);
    }
}
