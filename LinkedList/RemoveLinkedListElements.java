//Time Complexity:O(n)
//Space Complexity:O(1)


class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
ListNode temp=new ListNode(-1);
temp.next=head;
ListNode curr=temp;
while(curr.next!=null)
{
    if(curr.next.val==val)
    {
        curr.next=curr.next.next;
    }
    else{
        curr=curr.next;
    }
}
return temp.next;
    
}

}
