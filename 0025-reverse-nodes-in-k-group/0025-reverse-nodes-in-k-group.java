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
    public ListNode findKthNode(ListNode temp, int k) {
        while(temp!=null && k>1) {
            temp = temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseLL(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while(curr!=null) {
            ListNode fwd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fwd;
        }

        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode ansHead = null;
        ListNode nextNode = null;
        ListNode preNode = null;

        while(temp!=null) {
            // Find kth Node
            ListNode kthNode = findKthNode(temp, k);
            if(ansHead==null) ansHead = kthNode;
            if(kthNode==null) {
                if(temp==head) return head;
                else {
                    preNode.next = temp;
                    return ansHead;
                }
            }

            // Break LL
            nextNode = kthNode.next;
            kthNode.next = null;
            
            // Reverse LL
            ListNode newHead = reverseLL(temp);

            if(temp!=head) preNode.next = kthNode;
            preNode = temp;
            temp = nextNode;
        }

        return ansHead;
    }
}