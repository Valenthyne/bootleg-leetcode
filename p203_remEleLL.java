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
        
        // Start at beginning of list
        ListNode cur = head;
        ListNode prev = null;
        
        // Begin cycling throughout the list
        while (cur != null) {
            
            // Store the value of the current node in v
            int v = cur.val;
            
            // Case 1: Value matches, prev is a pre-existing node
            if (v == val && prev != null) {
                // Swap next pointers of previous to the current next
                prev.next = cur.next;
                // Advance the current node, forget this one
                cur = cur.next;
            // Case 2: Value to be removed is at the start of the list
            } else if (v == val && prev == null ) {
                // Just advance the head a node
                head = head.next;
                cur = cur.next;
            // Value does not match, move forward
            } else {
                prev = cur;
                cur = cur.next;
            }
            
        }
        
        return head;
    }
}
