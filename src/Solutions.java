public class Solutions {

    /* Problem 19. Remove Nth Node From End of List
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     *  Problem description:
     *  Given the head of a linked list, remove the nth node from the end of the list and return its head.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow = slow.next.next;
        return dummy.next;
    }

    /* Problem 142. Linked List Cycle II
     * https://leetcode.com/problems/linked-list-cycle-ii/
     *  Problem description:
     *  Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
     *  There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
     * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
     * connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
     * Do not modify the linked list.
     */

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode node1 = head;
                ListNode node2 = fast;
                while (node1 != node2) {
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }
        }
        return null;
    }
}
