//Time Complexity:O(n)
//Space Complexity:O(1)

class PalindromicLinkedList {
    public boolean isPalindrome(ListNode head) {
     ListNode fast=head;
     ListNode slow=head;
     while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
     }
      ListNode reverseList(ListNode head)
      {
       ListNode prev=null;
        while(head!=null)
        {
           ListNode next=head.next;
           head.next=prev;
           prev=head;
           head=next;
         

        }
         return prev; 
      
       
    }
}