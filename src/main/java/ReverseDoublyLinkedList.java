public class ReverseDoublyLinkedList {

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        // Write your code here
        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode previous = null;
        DoublyLinkedListNode next;
        while(current != null){

            next = current.next;
            current.prev = next;
            current.next = previous;
            previous = current;
            current = next;

        }
        return previous;

    }
}
