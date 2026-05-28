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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = list1, j = list2;
        
        while(i!=null && j!=null) {
            if(i.val < j.val) {
                temp.next = i;
                i = i.next;
                temp = temp.next;
            }
            else {
                temp.next = j;
                j = j.next;
                temp = temp.next;
            }
        }
        
        if(i != null) {
            temp.next = i;
        }
        else {
            temp.next = j;
        }
        return dummy.next;
    }
}