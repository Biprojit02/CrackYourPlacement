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

 //Twopass
class Solution {
    public int lengthOfLL(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lengthOfLL = lengthOfLL(head);
        if(lengthOfLL == n){
            ListNode temp = head.next;
            head.next = null;
            return temp;
        }

        int travelLength = lengthOfLL - n;
        ListNode prev = null;
        ListNode temp = head;
        while(travelLength-- > 0){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}