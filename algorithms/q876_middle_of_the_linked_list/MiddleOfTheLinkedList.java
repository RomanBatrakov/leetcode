package q876_middle_of_the_linked_list;

import q142_linked_list_cycle_2.ListNode;

import java.util.ArrayList;
import java.util.List;

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
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        List<ListNode> nodeList = new ArrayList<>();
        do {
            nodeList.add(head);
            head = head.next;
        } while (head != null);
        int index = 0;
        if (nodeList.size() > 2) {
            index = nodeList.size() / 2;
        } else {
            index = 1;
        }
        return nodeList.get(index);
    }
}
