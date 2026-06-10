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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null) {
            if(st.isEmpty()) {
                st.push(temp);
                temp = temp.next;
            }
            else {
                while(!st.isEmpty() && temp.val>st.peek().val) {
                    st.pop();
                }
                st.push(temp);
                temp = temp.next;
            }
        }
        
        Stack<ListNode> newSt = new Stack<>();
        while(!st.isEmpty()) {
            newSt.push(st.pop());
        }

        ListNode dummy = new ListNode(-1);
        temp = dummy;
        while(!newSt.isEmpty()) {
            temp.next = newSt.pop();
            temp = temp.next;
        }

        return dummy.next;
    }
}