import java.util.Stack;

public class LargestStack {
    public static Stack main=new Stack();
    public static Stack temp=new Stack();
    public void push(int item) {
        main.push(item);
        if(temp.size()==0){
            temp.push(item);
        } else {
            if((int)temp.peek()>item){
                temp.push(temp.peek());
            } else {
                temp.push(item);
            }
        }
    }

    public int pop() {
        if(main.size()==0) return 0;
        int a = (int)main.pop();
        temp.pop();
        return a;
    }

    public int getMax() {
        return (int)temp.peek();
    }
}