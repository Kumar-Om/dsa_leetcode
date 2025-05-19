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
        if(head==null||k==0||head.next==null)return head;
        ListNode temp=head;
        int c=0,n=1;

        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%n;
        c=n-k-1;
        temp=head;

        while(c>0){
            temp=temp.next;
            c--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}