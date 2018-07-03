public class DeleteNode {
    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static void deleteNode(LinkedListNode nodeToDelete) {

        // delete the input node from the linked list
        nodeToDelete.value=nodeToDelete.next.value;
        nodeToDelete.next=nodeToDelete.next.next;

    }

}