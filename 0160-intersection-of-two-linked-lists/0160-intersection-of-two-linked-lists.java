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
        ListNode temp = headA;
        while(temp!=null) {
            temp = temp.next;
            lengthA++;
        }
        // Finding Length of 2nd LL
        temp = headB;
        int lengthB = 0;
        while(temp!=null) {
            temp = temp.next;
            lengthB++;
        }
        if(lengthA>=lengthB) {
            ListNode tempA = headA;
            for(int i = 0; i < lengthA-lengthB; i++) {
                tempA = tempA.next;
            }

            ListNode tempB = headB;
            while(tempA != tempB) {
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempA;
        }
        else {
            ListNode tempB = headB;
            for(int i = 0; i < lengthB-lengthA; i++) {
                tempB = tempB.next;
            }

            ListNode tempA = headA;
            while(tempA != tempB) {
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempB;
        }
    }
}