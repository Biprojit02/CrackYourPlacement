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

 //One pass
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
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