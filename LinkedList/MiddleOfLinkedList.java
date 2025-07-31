//Time Complexity:O(n)
//Space Complexity:O(1)

class MiddleOfLinkedList{
    public ListNode middleNode(ListNode head) {
      ListNode fast=head;
      ListNode slow=head;
      while(fast!=null && fast.next!=null)
      {
        fast=fast.next.next;
        slow=slow.next;
      }
      return slow;
      }

}