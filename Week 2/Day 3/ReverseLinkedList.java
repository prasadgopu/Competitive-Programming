public class ReverseLinkedList {
    public static void main(String[] args){

    }

    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static LinkedListNode reverse(LinkedListNode headOfList) {
        if(headOfList==null)return null;
        LinkedListNode current=headOfList;
        LinkedListNode before=null,after=current.next;
        while (current!=null){
            after=current.next;
            current.next=before;
            before=current;
            current=after;
        }
        headOfList=before;
        return headOfList;
    }
}