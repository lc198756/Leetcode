/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newHead=new ListNode(0);
        newHead.next=head;
        if(head==null||head.next==null)return head;
        ListNode pre=newHead;
        ListNode node1=null;
        ListNode node2=null;
        for(int i=0;i<n;i++){
            if(i<m-1) pre=pre.next;
            else if(i==m-1){
                node1=pre.next;
                node2=node1.next;
            }
            else{
                node1.next=node2.next;
                node2.next=pre.next;
                pre.next=node2;
                node2=node1.next;
            }
        }
        return newHead.next;
    }
}
