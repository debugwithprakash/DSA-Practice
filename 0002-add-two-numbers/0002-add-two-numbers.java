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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        int sum = 0;
        while(temp1!=null || temp2!=null) {
            if(temp1==null) {
                sum = carry+temp2.val;
                temp2 = temp2.next;
            }
            else if(temp2==null) {
                sum = carry+temp1.val;
                temp1 = temp1.next;
            }
            else {
                sum = carry+temp1.val+temp2.val;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            ListNode n = new ListNode(sum%10);
            temp.next = n;
            temp = temp.next;
            if(sum>9) carry = 1;
            else carry = 0;
            sum = 0;
        }
        if(carry==1) {
            ListNode n = new ListNode(carry);
            temp.next = n;
            temp = temp.next;
        }
        temp.next = null;
        return dummy.next;
    }
}