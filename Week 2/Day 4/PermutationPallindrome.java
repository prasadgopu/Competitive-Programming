import java.util.HashMap;
import java.util.Map;

public class PermutationPallindrome {
    public static boolean hasPalindromePermutation(String theString) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<theString.length();i++){
            Character key=theString.charAt(i);
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            } else {
                map.put(key,1);
            }
        }
        System.out.println(map);
        int sum=0;
        for(Map.Entry m:map.entrySet()){
            int temp=(int)m.getValue()%2;
            if(temp!=0){
                sum=sum+temp;
            }
        }
        if(sum>1) return false;
        else return true;
    }

    public static void main(String[] args){
        System.out.println(hasPalindromePermutation("tattarrattat"));
    }
}