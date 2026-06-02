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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ArrayList<ListNode> arr1 = new ArrayList<>();
        ArrayList<ListNode> arr2 = new ArrayList<>();
        for(ListNode n : lists) {
            arr1.add(n);
        }
        while(arr1.size()+arr2.size() > 1) {
            while(arr1.size() > 0) {
                
                if(arr1.size() == 1) {
                    arr2.add(arr1.remove(0));
                    break;
                }
                
                ListNode a = arr1.get(arr1.size()-1);
                arr1.remove(arr1.size()-1);
                
                ListNode b = arr1.get(arr1.size()-1);
                arr1.remove(arr1.size()-1);
                
                ListNode c = merge(a, b);
                arr2.add(c);
            }
            while(arr2.size() > 0) {
                
                if(arr2.size() == 1) {
                    arr1.add(arr2.remove(0));
                    break;
                }
                
                ListNode a = arr2.get(arr2.size()-1);
                arr2.remove(arr2.size()-1);
                
                ListNode b = arr2.get(arr2.size()-1);
                arr2.remove(arr2.size()-1);
                
                ListNode c = merge(a, b);
                arr1.add(c);
            }
        }
        if(arr1.size() == 1) return arr1.get(0);
        else return arr2.get(0);
    }
    ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode temp1 = a;
        ListNode temp2 = b;
        while(temp1!=null && temp2!=null) {
            if(temp1.val<=temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            }
            else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1 != null) {
        temp.next = temp1;
        }
        else {
        temp.next = temp2;
        }

        return dummy.next;
    }
}