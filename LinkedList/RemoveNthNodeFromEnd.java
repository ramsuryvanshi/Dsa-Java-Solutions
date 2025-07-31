//Time Complexity:O(n)
//Space Complexity:O(1)

class RemoveNthNodeFromEnd{
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy=new ListNode(-1);
    dummy.next=head;
    ListNode ptr1=dummy;
    ListNode ptr2=dummy;
    for(int i=0;i<n;i++)
    {
        ptr2=ptr2.next;
    }
    while(ptr2.next!=null)
    {
        ptr1=ptr1.next;
        ptr2=ptr2.next;
    }
    ptr1.next=ptr1.next.next;
    return dummy.next;
    }
}