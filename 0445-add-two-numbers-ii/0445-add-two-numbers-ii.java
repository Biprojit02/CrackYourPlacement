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
    public ListNode reverseLL(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode last = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseLL(l1);
        l2 = reverseLL(l2);

        int sum = 0;
        int carry = 0;
        ListNode ans = new ListNode(0);
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ans.val = sum % 10;
            carry = sum / 10;
            
            ListNode newNode = new ListNode(carry);
            newNode.next = ans;
            ans = newNode;
            sum = carry;
        }

        return carry == 0 ? ans.next : ans;
    }
}