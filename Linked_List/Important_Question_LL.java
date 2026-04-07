package com.company.Linked_List;

import java.util.*;

public class Important_Question_LL {

   // Find the nth node from the end & remove it.
    //Time complexity - O(n)
   // Space complexity - O(1)


    static class ListNode {
         int val ;
         ListNode next;

         ListNode(int val){
             this.val = val;
             this.next = null;
         }
     }

    public ListNode removeNthFromEnd(ListNode head ,int n ){
        if (head.next == null){
            return null;
        }

        //size
        int size =0 ;
        ListNode  curr = head;
        while (curr != null){
            curr = curr.next;
            size++;
        }

        // Step 2: If removing head
        if (n == size){
            return head.next;
        }
        // Step 3: Find previous node
        int indexToSearch = size - n;
        ListNode prev = head ;
        int i = 1;
        while(i < indexToSearch){
            prev = prev.next;
            i++;
        }
        // Step 4: Remove node
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        Important_Question_LL odj = new Important_Question_LL();

        ListNode Head = new ListNode(1);
        Head.next =new ListNode(2);
        Head. next.next =new ListNode(3);
        Head.next.next.next = new ListNode(4);
        Head.next.next.next.next = new ListNode(5);

        ListNode curr = Head;
        while(curr != null){
            System.out.print(curr.val + " ->");
            curr = curr.next;
        }
    }
}
