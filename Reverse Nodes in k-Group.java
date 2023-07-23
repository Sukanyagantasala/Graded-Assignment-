public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode reverseKGroup(ListNode head, int n) {

     ListNode  cur = head;
    int c = 0;
    while (cur != null && c != n) { 
        cur = cur.next;
        c++;
    }
    if (c == n) { 
        cur = reverseKGroup(cur, n); 
        while (c-- > 0) { 
            ListNode temp = head.next; 
            head.next = cur; 
            cur = head; 
            head = temp; 
        }
        head = cur;
    }
    return head;
   
        
    }
}

