/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        for(int i = 1; i<=n; i++){
            temp = temp.next;
        }

        if(temp == null){
            ListNode result = head.next;
            head.next = null;
            return result;
        }

        ListNode prev = head;
        while(temp != null && temp.next != null){
            prev = prev.next;
            temp = temp.next;
        }

        prev.next = prev.next.next;
        return head;
    }
}

/*
class Solution {
    public int getLengthOfLL(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int L = getLengthOfLL(head);

       if(n == L){
        ListNode temp = head.next;
        head.next = null;
        return temp;
       } 

        int front_length = L - n;
        ListNode temp = head;
        ListNode prev = null;
        while(front_length-- > 0){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return head;
    }
}
*/