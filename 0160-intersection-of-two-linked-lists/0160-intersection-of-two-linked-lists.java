/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode tempA = headA;
        while(tempA!=null) {
            lenA++;
            tempA = tempA.next;
        }

        int lenB = 0;
        ListNode tempB = headB;
        while(tempB!=null) {
            lenB++;
            tempB = tempB.next;
        }

        if(lenA > lenB) {
            int diff = lenA-lenB;
            tempA = headA;
            tempB = headB;
            for(int i=0; i<diff; i++) {
                tempA = tempA.next;
            }
        } else {
            int diff = lenB-lenA;
            tempA = headA;
            tempB = headB;
            for(int i=0; i<diff; i++) {
                tempB = tempB.next;
            }
        }

        while(tempA!=null && tempB!=null) {
            if(tempA == tempB) return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
}