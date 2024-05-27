import java.io.*;
import java.util.*;
import java.util.stream.*;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }
}

class Result {
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        SinglyLinkedListNode current = llist;
        while (current != null) {
            SinglyLinkedListNode next = current.next;
            while (next != null && next.data == current.data) {
                current.next = current.next.next;
                next = current.next;
            }
            current = current.next;
        }
        return llist;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        IntStream.range(0, t).forEach(tItr -> {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = Integer.parseInt(sc.nextLine());
            IntStream.range(0, llistCount).forEach(i -> {
                int llistItem = Integer.parseInt(sc.nextLine());
                llist.insertNode(llistItem);
            });

            SinglyLinkedListNode llist1 = Result.removeDuplicates(llist.head);

            SinglyLinkedListPrintHelper.printList(llist1, " ");
        });
    }
}
