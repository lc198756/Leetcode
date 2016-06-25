//206. Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
       ListNode pre = head;
        ListNode p = head.next;
        pre.next = null;
        ListNode nxt;
        while(p!=null) {
            nxt = p.next;
            p.next = pre;
            pre = p;
            p = nxt;
      }
      return pre;
    }
}
//2recursive
public ListNode reverseList(ListNode head) {
  if(head==null || head.next == null) return head;
//get second node
  ListNode second = head.next;
//set first's next to be null head.next = null;
  ListNode rest = reverseList(second);
  second.next = head;
  return rest; 
}
