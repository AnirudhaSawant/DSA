package Linked List.Easy;

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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) {
            return true;
        }

        ListNode mid = getMid(head);
        ListNode temp = mid.next;
        mid.next = reverse(temp);

        ListNode head1 = head;
        ListNode head2 = mid.next;

        while(head2 != null) {
            if(head1.val != head2.val) {
                return false;
            }
            else{
                head1 = head1.next;
                head2 = head2.next;
            }
        }

        temp = mid.next;
        mid.next = reverse(temp);
        return true;        
    }

    public ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nnext = null;

        while(curr != null) {
            nnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nnext;
        }
        return prev;
    }
}
