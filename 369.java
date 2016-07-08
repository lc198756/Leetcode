/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //1
public class Solution {
    public ListNode plusOne(ListNode head) {
        head = reverse(head);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode x = dummy;
        int carry = 1;
        while (carry > 0 || x.next != null) {
            if (x.next != null) {
                x = x.next;
                carry += x.val;
                x.val = carry % 10;
                carry /= 10;
            }
            else {
                x.next = new ListNode(carry);
                x = x.next;
                carry = 0;
            }
        }
        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode tail = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }
        return tail;
    }
}
//2
public class Solution {
    public ListNode plusOne(ListNode head) {
    if (head == null)
        return new ListNode(1);
    ListNode plused = plusOne(head.next);
    if (plused != head.next)
        head.val++;
    if (head.val <= 9)
        return head;
    head.val = 0;
    plused.next = head;
    return plused;
}
}
