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
// ✅ ListNode ko Solution class ke bahar declare kiya
class Solution {
    
   
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null; // Edge case: empty or single node
        
        ListNode temp = head;
        int n = 0;

        while (temp != null) {
            temp = temp.next;
            n++;
        }
        
        int count = n / 2; // Integer division is sufficient
        
        if (count == n - 1) { // If last element
            return removeLast(head);
        } else {
            return remove(head, count);
        }
    }

    // Removing from last
    private ListNode removeLast(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode temp = head;
        while (temp.next.next != null) { // Stop at second last node
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Get method
    private ListNode get(ListNode head, int count) {
        if (count < 0) return null;
        ListNode temp = head;
        for (int i = 0; i < count && temp != null; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Remove method
    private ListNode remove(ListNode head, int count) {
        if (count == 0) return head.next; // Removing head

        ListNode prev = get(head, count - 1);
        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
        }
        return head;
    }
}
