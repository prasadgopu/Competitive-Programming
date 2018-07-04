import java.util.Stack;

public class BracketValidator {
    public static boolean isValid(String code) {
        if(code.length()%2!=0){
            return false;
        }
        Stack s = new Stack();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '(' || code.charAt(i) == '[' || code.charAt(i) == '{') {
                s.push(code.charAt(i));
            } else if ((code.charAt(i) == ')') && ((char) s.peek() == '(')) {
                s.pop();
            } else if ((code.charAt(i) == ']') && ((char) s.peek() == '[')) {
                s.pop();
            } else if ((code.charAt(i) == '}') && ((char) s.peek() == '{')) {
                s.pop();
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String input="[[]()";
        System.out.println(isValid(input));
    }
}
