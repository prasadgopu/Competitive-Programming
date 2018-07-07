public class KthLastNode {

    public int value;
    public KthLastNode next;

    public KthLastNode(int value) {
        this.value = value;
    }

    public static void main(String[] args){

    }
    public static KthLastNode kthToLastNode(int k, KthLastNode head) {
        if(k==0) throw new IllegalArgumentException();
        int count=0;
        KthLastNode first=head;
        KthLastNode second=head;
        if(head==null) return null;
        for(int i=0;i<k && second!=null;i++){
            second=second.next;
            count++;
        }
        while (second!=null) {
            first = first.next;
            second = second.next;
            count++;
        }
        if(k>count)throw new IllegalArgumentException();
        return first;
    }
}