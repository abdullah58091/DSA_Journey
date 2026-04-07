package com.company.Linked_List;

public class Floyd_Cycle {
   // Detecting Loop in a Linked List.
   // Time complexity - O(n)
   // Space complexity - O(1)


    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {  // meeting point

                return true;
            }
        }

        return false;
    }
    // Test
    public static void main(String[] args) {
        Floyd_Cycle obj = new Floyd_Cycle();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        // create cycle
        head.next.next.next = head.next;

        System.out.println(obj.hasCycle(head));
    }
}


