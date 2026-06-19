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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left== right)return head;
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode before=dummy;

        for(int i=1;i<left;i++){
            before=before.next;
        }

        ListNode curr=before.next,prev=null;
        int count=right-left+1;
        while(count-- >0){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }

        before.next.next=curr;
        before.next=prev;
        
        return dummy.next;
    }
}