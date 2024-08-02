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
class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode temp = head;
        for(int i = 0; i<n; i++){
            temp = temp.next;
        }

        if(temp == null){
            ListNode res = head.next;
            head.next = null;
            return res;
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
 // TWO PASS APPROACH
class Solution {
    public int lengthOfLL(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = lengthOfLL(head);
        if(l == n){
            ListNode temp = head.next;
            head.next = null;
            return temp;
        }

        int travel_length = l - n;
        ListNode prev = null;
        ListNode temp = head;

        while(travel_length-- > 0){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return head;
    }
}
*/