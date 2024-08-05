/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while(node != null && node.next != null){
            prev = node;;
            prev.val = prev.next.val;
            node = prev.next;
        }
        prev.next = null;
    }
}