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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp=head;
        int n=1,c=0;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        k=k%n+1;
        if (k == 0) return head;
        temp.next=head;
        ListNode temp2=head;
        while(c<n-k){
            temp2=temp2.next;
            c++;
        }
        head=temp2.next;
        temp2.next=null;
        return head;

    }
}