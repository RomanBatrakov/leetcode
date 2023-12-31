package q142_linked_list_cycle_2;

import java.util.HashSet;

/**
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle.
 * Note that pos is not passed as a parameter.

 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> scope = new HashSet<>();

        while (head != null && head.next != null) {
            if (scope.contains(head.next)) {
                return head.next;
            } else {
                scope.add(head);
                head = head.next;
            }
        }

        return null;
    }
}
