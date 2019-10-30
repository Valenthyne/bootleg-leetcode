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
        
        if (head == null || head.next == null)
            return head;
        
        ListNode prev = head;
        ListNode cur = head.next;
        
        head = cur;
        
        while (prev.next != null) {
            
            ListNode nxt = cur.next;
            cur.next = prev;
            
            if (nxt == null || nxt.next == null) {
                prev.next = nxt;
                break;
            }
            
            prev.next = nxt.next;
            
            prev = nxt;
            cur = nxt.next;        
            
        }
        
        return head;    
    }
}
