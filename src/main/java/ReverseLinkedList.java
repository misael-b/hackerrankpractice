import java.io.BufferedWriter;
import java.io.IOException;

public class ReverseLinkedList {

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = llist;


        while (current != null) {
            SinglyLinkedListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;


    }


}
