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
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        temp=head;
        for(int i=0;i<arr.size();i++)
        {
            temp.val=arr.get(i);
            temp=temp.next;
        }
        return head;
    }
}

// O(2*N + N*LogN), we traverse the linked list, store its elements in an array, sort it, and then copy the sorted values back into the original list.
// O(N) , additional space required to store all the elements of linked list in an array.