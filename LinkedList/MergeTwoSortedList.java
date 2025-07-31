//Time Complexity:O(n + m)
//Space Complexity:O(1)

class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     ListNode temp=new ListNode(0);
     ListNode curr=temp;
     while(l1!=null && l2!=null)
     {
        if(l1.val<l2.val)
        {
            curr.next=l1;
            l1=l1.next;
        }
        else{
            curr.next=l2;
            l2=l2.next;
        }
        curr=curr.next;
     }
     curr.next=l1!=null?l1:l2;
     return temp.next;
    }
}