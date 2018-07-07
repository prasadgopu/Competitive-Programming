import java.util.HashSet;
import java.util.Set;

public class RecursiveStringPermutations {
    public static void main(String[] args){
        System.out.println(getPermutations("abcd"));
    }

    public static Set<String> getPermutations(String prefix, String input, HashSet<String> set){
        int n=input.length();
        if(n==0) set.add(prefix);
        else {
            for(int i=0;i<n;i++){
                getPermutations(prefix+input.charAt(i),input.substring(0,i)+input.substring(i+1,n),set);
            }
        }
        return set;
    }

    public static Set<String> getPermutations(String inputString) {
        String prefix="";
        HashSet<String> set=new HashSet<>();
        Set<String> result=getPermutations(prefix,inputString,set);
        return result;
    }
}