/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}