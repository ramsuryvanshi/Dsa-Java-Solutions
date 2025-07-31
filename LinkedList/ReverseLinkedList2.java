//Time Complexity:O(n)
//Space Complexity:O(1)



class ReverseLinkedList2{
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy=new ListNode (0);
       dummy.next=head;
       ListNode leftpre=dummy;
       ListNode curr=head;

       for(int i=0;i<left-1;i++)
       {
        leftpre=leftpre.next;
        curr=curr.next;

       }

       ListNode stnd=curr;
       ListNode prenode=null;
       for(int i=0;i<=right-left;i++)
       {
        ListNode temp=curr.next;
        curr.next=prenode;
        prenode=curr;
        curr=temp;

       }
       leftpre.next=prenode;
       stnd.next=curr;
       return dummy.next;

    }

}