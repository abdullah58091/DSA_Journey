public class RotateLinkedList {

    // Definition of ListNode
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {

        // Edge case
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find length and last node
        ListNode curr = head;
        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // Step 2: Make circular
        curr.next = head;

        // Step 3: Reduce k
        k = k % length;

        // Step 4: Find new tail
        int steps = length - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Step 5: Break
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Create list: 10 -> 20 -> 30 -> 40 -> 50
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        int k = 2;

        System.out.print("Original: ");
        printList(head);

        head = rotateRight(head, k);

        System.out.print("Rotated: ");
        printList(head);
    }
}