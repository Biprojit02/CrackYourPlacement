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
    public ListNode merge(ListNode list1 , ListNode list2){
        ListNode start = new ListNode(0);
        ListNode temp = start;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1!=null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        return start.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right  = sortList(right);
        return merge(left,right);
    }
    public ListNode middle(ListNode head){
        ListNode slow = head;        
        ListNode fast = head.next;
        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}