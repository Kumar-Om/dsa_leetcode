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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=null;
        if(head.next==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            temp=slow;
            slow=slow.next;
        }
       
        temp.next=temp.next.next;
        slow=null;
        return head;
    }
}