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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;         
            fast = fast.next.next;    
        }
       System.out.println(slow.val);
        ListNode temp = null;
        ListNode current = slow;
        ListNode prev = null;
        while (current != null){
                temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
        }

        ListNode p1 = head;
        ListNode p2 = prev;
        while (p2 !=null && p1 != null ){
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}