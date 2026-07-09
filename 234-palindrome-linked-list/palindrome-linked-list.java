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
    public ListNode reverseList(ListNode newHead)
    {
        ListNode curr=newHead;
        ListNode prev=null;
        ListNode Next=null;
        while(curr!=null)
        {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        //base case
        if(head.next==null)return true;
        //create a deep copy
        ListNode newHead=new ListNode(head.val);
        ListNode t1=head.next;
        ListNode t2=newHead;
        while(t1!=null)
        {
            ListNode temp=new ListNode(t1.val);
            t2.next=temp;
            t1=t1.next;
            t2=t2.next;
        }
        newHead=reverseList(newHead);
        t1=head;
        t2=newHead;
        while(t1!=null)
        {
            if(t1.val!=t2.val)return false;
            t1=t1.next;
            t2=t2.next;
        }
        return true;

    }
    
}