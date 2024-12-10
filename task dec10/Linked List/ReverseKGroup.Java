class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseKGroup {

    // Function to reverse the linked list in groups of k
    public static Node reverseInGroups(Node head, int k) {
        if (head == null || k <= 1) {
            return head; // No need to reverse if k is 1 or the list is empty
        }

        Node current = head;
        Node prevTail = null; // Keeps track of the tail of the previous reversed group
        Node newHead = null; // Will be the new head of the entire list

        // Traverse the list and reverse groups of size k
        while (current != null) {
            Node groupHead = current;
            Node prev = null;
            Node next = null;
            int count = 0;

            // Reverse k nodes
            while (current != null && count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            // If it's the first group, set the new head
            if (newHead == null) {
                newHead = prev;
            }

            // Link the previous group to the current reversed group
            if (prevTail != null) {
                prevTail.next = prev;
            }

            // The old head (groupHead) should point to the next group (current)
            groupHead.next = current;

            // Move prevTail to the end of the current reversed group
            prevTail = groupHead;
        }

        return newHead;
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
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list in groups of k = 3
        int k = 3;
        head = reverseInGroups(head, k);

        System.out.println("Linked List after reversing in groups of " + k + ":");
        printList(head);
    }
}
