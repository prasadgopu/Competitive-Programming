import java.util.Stack;

public class QueueWith2Stacks {
    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    public void enqueue(int item) {
        while (!outStack.isEmpty()){
            inStack.push(outStack.pop());
        }
        inStack.push(item);
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }

    public int dequeue() {
        return outStack.pop();
    }

    public static void main(String[] args){
        final QueueWith2Stacks q = new QueueWith2Stacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("dequeue #1: "+q.dequeue());
        System.out.println("dequeue #2: "+q.dequeue());
    }
}