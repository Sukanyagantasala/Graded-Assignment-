 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
                  if (head == null || head.next == null) {
            return head;
        }
    ListNode a =new ListNode(0);
    a.next=head;
    ListNode curr=a;
   while (curr.next != null && curr.next.next != null) {
            ListNode l1 = curr.next;
            ListNode l2 = curr.next.next;
            curr.next = l2;
            l1.next = l2.next;
            l2.next = l1;
            curr = curr.next.next;
        }  
      return a.next;
    
    }
}
