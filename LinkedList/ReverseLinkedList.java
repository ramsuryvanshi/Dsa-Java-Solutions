//Time Complexity:O(n)
//Space Complexity:O(1)

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
       ListNode curr=head;
       ListNode prev=null;
       while(curr!=null)
       {
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
       }
       return prev;
    }
}