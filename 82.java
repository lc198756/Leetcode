/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode fakehead=new ListNode(0);
        fakehead.next=head;
        ListNode pre=fakehead;
        ListNode cur=fakehead.next;
        ListNode fo=fakehead.next.next;
        boolean flag=false;
        while(fo!=null){
            if(cur.val==fo.val){
                flag=true;
                fo=fo.next;
                if(fo==null) pre.next=null;
            }
            else{
                if(flag){
                    cur=fo;
                    pre.next=cur;
                    fo=fo.next;
                    flag=false;
                }else{
                    fo=fo.next;
                    cur=cur.next;
                    pre=pre.next;
                }
            }
        }
        return fakehead.next;
    }
}
