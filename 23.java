/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0) return null;
        PriorityQueue<ListNode> q=new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
        @Override
        public int compare(ListNode o1, ListNode o2) {
            if (o1.val == o2.val) {
            return 0;
            }
            return o1.val < o2.val ? -1 : 1;
            }
            });
        for(int i=0;i<lists.length;i++){
            ListNode node=lists[i];
            if(node!=null){
                q.add(node);
            }
        }
        ListNode head=null;
        ListNode pre=head;
        while(!q.isEmpty()){
            ListNode cur=q.poll();
            if(cur.next!=null){
                q.add(cur.next);
            }
            if(head==null){
                head=cur;
                pre=head;
            }
            else{
                pre.next=cur;
            }
            pre=cur;

        }
        return head;
    }
}
