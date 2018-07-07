import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args){
        String[] str1={"anagram","Keep","MOther In Law","School Master","ASTRONOMERS", "Toss","joy","Debit Card","SiLeNt CAT","Dormitory"};
        String[] str2={"nagaram", "Peek", "Hitler Woman", "The Classroom", "NO MORE STARS", "Shot", "enjoy", "Bad Credit", "LisTen Act","Dirty Room"};
        for(int i=0;i<str1.length;i++) {
            System.out.println("Testcase "+i+"= "+str1[i]+", "+str2[i]+": "+checkAnagram(str1[i], str2[i]));
        }
    }

    public static boolean checkAnagram(String a,String b){
        String s=a.toLowerCase();
        String t=b.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp!=' ') {
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }
        for(int k=0;k<t.length();k++){
            char key=t.charAt(k);
            if(key!=' ') {
                if (!map.containsKey(key)) {
                    return false;
                } else {
                    map.put(key, map.get(key) - 1);
                }
            }
        }
        for(Map.Entry m:map.entrySet()){
            if((int)m.getValue()!=0)return false;
        }
        return true;
    }
}
