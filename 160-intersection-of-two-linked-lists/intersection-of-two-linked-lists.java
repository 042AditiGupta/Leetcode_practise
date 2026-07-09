/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode temp)
    {
        int length=0;
        while(temp!=null)
        {
            temp=temp.next;
            length++;
        }
        return length;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int lengthA=length(tempA);
        int lengthB=length(tempB);
        ListNode dummy=new ListNode(-1);
        ListNode tempC=dummy;
        if(lengthA<lengthB)
        {
           
            for(int i=1;i<=lengthB-lengthA;i++)
            {
                tempB=tempB.next;
            }
        }
        else
        {
             for(int i=1;i<=lengthA-lengthB;i++)
            {
                tempA=tempA.next;
            }
        }
        while(tempA!=null && tempB!=null)
        {
            if(tempA==tempB)
            {
                tempC.next=tempA;
                tempC=tempC.next;
            }
            tempA=tempA.next;
            tempB=tempB.next;

        }
        return dummy.next;
    }
}