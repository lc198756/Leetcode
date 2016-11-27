/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        ListNode fast=head,count=head;
        ListNode slow=head;
        ListNode pre=new ListNode(0);
        pre.next=head;
        int n=0;
        while(count!=null){
            n++;
            count=count.next;
        }
        k=k%n;
        if(k==0)return head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        pre.next=slow.next;
        slow.next=null;
        fast.next=head;
        return pre.next;
    }
}
