class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode t1 = head;
        
        while(t1.next!=null && t1!=null){
            if(t1.val==t1.next.val){
                t1.next=t1.next.next;
            }
            else{
                t1=t1.next;
            }
        }
        return head;
    }
}
