//1
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
        if(head==null) return null;
        if(head.next==null)return head;
        ListNode mov=head;
        while(mov.next!=null){
            if(mov.val==mov.next.val){
                mov.next=mov.next.next;
            }
            else mov=mov.next;
        }
        return head;
    }
}
//2
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
        if(head == null)
        return head;
    ListNode pre = head;
    ListNode cur = head.next;
    while(cur!=null)  
    {
        if(cur.val == pre.val)
            pre.next = cur.next;
        else
            pre = cur;
        cur = cur.next;
    }
    return head;
    }
}
