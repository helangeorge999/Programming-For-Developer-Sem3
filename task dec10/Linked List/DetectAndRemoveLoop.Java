class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectAndRemoveLoop {

    // Function to detect and remove the loop
    public static void detectAndRemoveLoop(Node head) {
        if (head == null || head.next == null) {
            return; // No loop if the list is empty or has only one node
        }

        Node slow = head; // Tortoise
        Node fast = head; // Hare

        // Detect loop using Floyd's Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, a loop is detected
            if (slow == fast) {
                System.out.println("Loop detected.");
                removeLoop(head, slow);
                return;
            }
        }
        System.out.println("No loop detected.");
    }

    // Function to remove the loop
    private static void removeLoop(Node head, Node loopNode) {
        Node ptr1 = head;
        Node ptr2 = loopNode;

        // Move both pointers at the same speed; they will meet at the start of the loop
        while (ptr1.next != ptr2.next) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // ptr2 is now pointing to the last node in the loop
        ptr2.next = null; // Break the loop
        System.out.println("Loop removed.");
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
        // Create a sample linked list with a loop: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (loop back to 3)
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next; // Create a loop

        // Detect and remove the loop
        detectAndRemoveLoop(head);

        // Print the linked list after removing the loop
        System.out.println("Linked list after removing the loop:");
        printList(head);
    }
}
