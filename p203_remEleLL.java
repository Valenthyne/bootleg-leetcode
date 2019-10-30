/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode cur = head;
        ListNode prev = null;
        
        while (cur != null) {
            
            int v = cur.val;
            
            if (v == val && prev != null) {
                prev.next = cur.next;
                cur = cur.next;
            } else if (v == val && prev == null ) {
                head = head.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
            
        }
        
        return head;
    }
}
