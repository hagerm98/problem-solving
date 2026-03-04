package leetcode;

import java.util.ArrayList;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {

        ArrayList<ListNode> arrayNode = new ArrayList<>();

        int length = 0;

        while (head != null) {
            arrayNode.add(head);
            head = head.next;
            length++;
        }

        return arrayNode.get(length / 2);
    }

    public ListNode middleNodeOptimized(ListNode head) {

        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }
}
