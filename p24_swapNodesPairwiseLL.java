/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode swapPairs(ListNode head) {
        
        // Case of empty list or single element list: return head
        if (head == null || head.next == null)
            return head;
        
        // Do first step outside of loop; prepare for swapping
        ListNode prev = head;
        ListNode cur = head.next;
        
        // Move the head forward to the current node
        head = cur;
        
        // If prev.next is null, no way to advance forward
        while (prev.next != null) {
            
            // Store the next node from current
            ListNode nxt = cur.next;
            
            // Point current node towards the one before it
            cur.next = prev;
            
            if (nxt == null || nxt.next == null) {
                prev.next = nxt;
                break;
            }
            
            // Move the previous node forward
            prev.next = nxt.next;
            
            // Advance previous node pointer
            prev = nxt;
            
            // Advance current ahead of previous
            cur = nxt.next;        
            
        }
        
        return head;    
    }
}
