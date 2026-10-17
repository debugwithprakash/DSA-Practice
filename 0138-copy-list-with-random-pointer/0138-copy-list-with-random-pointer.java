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
    public void insertCopyNodeInBetween(Node head) {
        Node temp = head;
        while(temp!=null) {
            Node dummy = new Node(temp.val);
            dummy.next = temp.next;
            temp.next = dummy;
            temp = temp.next.next;
        }
    }
    public void connectRandom(Node head) {
        Node temp = head;
        while(temp!=null) {
            if(temp.random!=null) temp.next.random = temp.random.next;
            else temp.next.random = null;
            temp = temp.next.next;
        }
    }
    public Node connectNext(Node head) {
        Node dummy = new Node(-1);
        Node t = dummy;
        Node temp = head;
        while(temp!=null) {
            t.next = temp.next;
            temp.next = temp.next.next;
            t = t.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        insertCopyNodeInBetween(head);
        connectRandom(head);
        return connectNext(head);
    }
}