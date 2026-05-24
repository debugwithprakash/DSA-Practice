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
        // Finding Length of 1st LL
        int lengthA = 0;
        ListNode tempA = headA;
        while(tempA!=null) {
            tempA = tempA.next;
            lengthA++;
        }
        // Finding Length of 2nd LL
        int lengthB = 0;
        ListNode tempB = headB;
        while(tempB!=null) {
            tempB = tempB.next;
            lengthB++;
        }
        // Set At equal Position
        tempA = headA;
        tempB = headB;
        if(lengthA>=lengthB) {
            for(int i = 0; i < lengthA-lengthB; i++) {
                tempA = tempA.next;
            }
        }
        else {
            for(int i = 0; i < lengthB-lengthA; i++) {
                tempB = tempB.next;
            }
        }
        // Increase while don't meet at same node
        while(tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}