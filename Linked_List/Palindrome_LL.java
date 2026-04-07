package com.company.Linked_List;

public class Palindrome_LL {


    //Check if a Linked List is a palindrome
    //Time complexity - O(n)
    //Space complexity - O(1)


        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }
        }

        // Find middle
        public ListNode getMiddle(ListNode head) {
            if (head == null) return null;

            ListNode slow = head;
            ListNode fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // Reverse list
        public ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        // Check palindrome
        public boolean isPalindrome(ListNode head) {

            if (head == null || head.next == null) {
                return true;
            }

            // Step 1: middle
            ListNode firstHalfEnd = getMiddle(head);

            // Step 2: reverse second half
            ListNode secondHalfStart = reverse(firstHalfEnd.next);

            // Step 3: compare
            ListNode p1 = head;
            ListNode p2 = secondHalfStart;

            boolean isPalin = true;

            while (p2 != null) {
                if (p1.val != p2.val) {
                    isPalin = false;
                    break;
                }
                p1 = p1.next;
                p2 = p2.next;
            }

            // Step 4: restore list (IMPORTANT 🔥)
            firstHalfEnd.next = reverse(secondHalfStart);

            return isPalin;
        }

        // Test
        public static void main(String[] args) {
            Palindrome_LL obj = new Palindrome_LL();

            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(1);

            System.out.println(obj.isPalindrome(head)); // true
        }
    }








 /*

    import java.util.*;

public boolean isPalindromeUsingLL(ListNode head) {

    LinkedList<Integer> list = new LinkedList<>();

    ListNode curr = head;
    while (curr != null) {
        list.add(curr.val);
        curr = curr.next;
    }

    while (list.size() > 1) {
        if (!list.removeFirst().equals(list.removeLast())) {
            return false;
        }
    }

    return true;
}

  */


