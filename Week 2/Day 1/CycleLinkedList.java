public class CycleLinkedList {
    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static boolean containsCycle(LinkedListNode firstNode) {

        // check if the linked list contains a cycle
        LinkedListNode t=firstNode;
        LinkedListNode r=firstNode;
        boolean result=false;
        while(t!=null && r!=null && r.next!=null){
            t=t.next;
            r=r.next.next;
            if(t==r){
                return true;
            }
        }

        return false;
    }
}