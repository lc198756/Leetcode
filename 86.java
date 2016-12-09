/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null)return head;
        ListNode small=new ListNode(0);
        ListNode sp=small;
        ListNode big=new ListNode(0);
        ListNode bp=big;
        while(head!=null){
            if(head.val<x){
                sp.next=head;
                sp=sp.next;
                head=head.next;
            }
            else{
                bp.next=head;
                bp=bp.next;
                head=head.next;
            }
        }
        bp.next=null;
        sp.next=big.next;
        return small.next;
    }
}
