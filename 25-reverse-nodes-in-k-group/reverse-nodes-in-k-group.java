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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode front=head;
        ListNode prev=null;
        while(front!=null){
            front=front.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }

    public ListNode kthNode(ListNode head,int k){
        ListNode tem=head;
        while(k>1){
            if(tem==null){
                return tem;
            }
            else{
                tem=tem.next;
                k--;
            }
        }
        return tem;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kth=kthNode(temp,k);
            if(kth==null){
                if (prev != null)prev.next=temp;
                break;
            }
            ListNode nextNode=kth.next;
            kth.next=null;
            reverse(temp);
            if(temp==head){
                head=kth;
            }
            else{
               
                prev.next=kth;
            }
            prev=temp;
                
            temp=nextNode;
        }
        return head;
    }
}