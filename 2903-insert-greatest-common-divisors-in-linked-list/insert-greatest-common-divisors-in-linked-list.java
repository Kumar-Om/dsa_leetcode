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
    public ListNode gcd(int A, int B){
        if(B==0){
        ListNode a=new ListNode(A);
        return a;
        }
        else{
            return gcd(B,A%B);
        }
        
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode temp=head;
        while(temp.next!=null){
            ListNode newnode=gcd(temp.val,temp.next.val);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
        }
        return head;
    }
}