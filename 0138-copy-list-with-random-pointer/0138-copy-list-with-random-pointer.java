/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        // create deep copy put next to original
        Node curr = head;
        Node copyCurr = null;
        while(curr != null){
            copyCurr = new Node(curr.val);
            copyCurr.next = curr.next;
            curr.next = copyCurr;
            curr = curr.next.next;
        }
        // create random pointers
        curr = head;
        copyCurr = head.next;
        while(curr != null){
            if(curr.random != null){
                copyCurr.random = curr.random.next;
            }
            curr = curr.next.next;
            if(copyCurr.next != null){
                copyCurr = copyCurr.next.next;
            }   
        }
        curr = head;
        copyCurr = head.next;
        Node copyHead = head.next;
        while(curr != null){
            curr.next = curr.next.next;
            if(copyCurr.next != null){
                copyCurr.next = copyCurr.next.next;
            }
            curr = curr.next;
            copyCurr = copyCurr.next;
        }
        return copyHead;
    }
}