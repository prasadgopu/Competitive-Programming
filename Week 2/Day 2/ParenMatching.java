import java.util.Stack;

public class ParenMatching {
    public static int getClosingParen(String sentence, int openingParenIndex) {
        Stack s=new Stack();
        int count=1;
        for(int i=0;i<sentence.length();i++){
            System.out.println(i);
            if(sentence.charAt(i)=='('){
                s.push(i);
                if(i>=openingParenIndex){
                    count++;
                }
            }
            if(sentence.charAt(i)==')' && count>1){
                s.pop();
                count--;
                if(count==1){
                    return i;
                }
            }
            else if(sentence.charAt(i)==')'){
                s.pop();
            }
        }
        if(count!=1){
            throw new IllegalArgumentException();
        }
        return 0;
    }

    public static void main(String[] args){
        String input="()()((()()))";
        System.out.println(getClosingParen(input,5));
    }
}