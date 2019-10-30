/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode u = null;
        ListNode v = head;

        
        while (v != null) {
            
            ListNode w = v.next;
            v.next = u;
            u = v;
            v = w;
            
        }
        
        return u;
    }
}
