class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        // Put EVERY node into the PriorityQueue
        for(int i = 0; i < lists.length; i++) {

            ListNode temp = lists[i];

            while(temp != null) {
                pq.offer(temp);
                temp = temp.next;
            }
        }

        // Create new sorted Linked List
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(!pq.isEmpty()) {

            ListNode node = pq.poll();

            curr.next = new ListNode(node.val);
            curr = curr.next;
        }

        return dummy.next;
    }
}