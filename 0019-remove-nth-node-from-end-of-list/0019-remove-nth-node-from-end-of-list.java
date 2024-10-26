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
 //TWO PASS
class Solution {
    public int lengthOfLL(ListNode head){
        int count = 0;
        ListNode temp = head;
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
        
        int length = l - n;
        ListNode prev = null;
        ListNode temp = head;
        while(length-- > 0){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return head;
    }
}