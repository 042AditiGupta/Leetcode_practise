/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null || head.next==null)return head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode firstHalf=head;
        ListNode secondHalf=slow.next;
        slow.next=null;
        firstHalf=sortList(firstHalf);
        secondHalf=sortList(secondHalf);
        return mergeList(firstHalf,secondHalf);
    }
    public ListNode mergeList(ListNode list1,ListNode list2)
    {
        
        ListNode dummy=new ListNode (-1);
        ListNode t3=dummy;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null && t2!=null)
        {
            if(t1.val<=t2.val)
            {
                t3.next=t1;
                t1=t1.next;
            }
            else
            {
                t3.next=t2;
                t2=t2.next;
            }
        t3=t3.next;
        }
        if(t1!=null)
        {
            t3.next=t1;
        }
        if(t2!=null)
        {
            t3.next=t2;
            
        }
        return dummy.next;
    }
}