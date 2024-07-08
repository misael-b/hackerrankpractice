public class InsertNodeAtPosition {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        if(position == 0){
            SinglyLinkedListNode node = new SinglyLinkedListNode(data);
            node.next = llist;
            return node;
        }
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode next;
        for(int i = 0; i<=1000; i++){
            next = current.next;

            if(i==position-1){
                SinglyLinkedListNode node2 = new SinglyLinkedListNode(data);
                current.next = node2;
                node2.next = next;
                return llist;
            }
            current = next;


        }
        return llist;
    }
}
