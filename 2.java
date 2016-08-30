/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //4ms
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
      //  if(l1==null||l2==null) return l1||l2;
        ListNode res=l1;
        int a=0;
        ListNode pre=new ListNode(0);
        pre.next=l1;
        while(l1!=null&&l2!=null){
            if(a==1){
                if((l1.val+l2.val+a)>=10){
                l1.val=(l1.val+l2.val+a)%10;

            }
            else{
                l1.val=l1.val+l2.val+a;
                a--;
            }
            }
            else{
                if((l1.val+l2.val)>=10){
                l1.val=(l1.val+l2.val)%10;
                a++;
            }
            else{
                l1.val=l1.val+l2.val;
            }
            }
            l1=l1.next;
            l2=l2.next;
            pre=pre.next;
        }
        while(l2!=null){
            pre.next=l2;
            if(a==1){
                if((l2.val+a)==10){
                l2.val=0;

            }
            else{
                l2.val=l2.val+a;
                a--;
            }
            }
            l2=l2.next;
            pre=pre.next;
        }
        while(l1!=null){

            if(a==1){
                if((l1.val+a)==10){
                l1.val=0;

            }
            else{
                l1.val=l1.val+a;
                a--;
            }
            }
            l1=l1.next;
            pre=pre.next;

        }
        if(a==1){
            pre.next=new ListNode(a);

        }
        return res;
    }
}
//2 recomend
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode p, dummy = new ListNode(0);
    p = dummy;
    while (l1 != null || l2 != null || carry != 0) {
        if (l1 != null) {
            carry += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            carry += l2.val;
            l2 = l2.next;
        }
        p.next = new ListNode(carry%10);
        carry /= 10;
        p = p.next;
    }
    return dummy.next;
}
}
