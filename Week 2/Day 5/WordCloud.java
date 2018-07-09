import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCloud {

    private Map<String, Integer> wordsToCounts = new HashMap<>();

    private void populateWordsToCounts_Ascii(String inputString) {
        String str="";
        for(int i=0;i<inputString.length();i++){
            int key=(int)inputString.charAt(i);
            if((key>=65 && key<=90)||(key>=97 && key<=122)){
                str=str+((char)key);
            }
            else {
                if(!str.equals("")){
                    if(wordsToCounts.containsKey(str))
                    wordsToCounts.put(str,wordsToCounts.get(str)+1);
                    else wordsToCounts.put(str,1);
                }
                str="";
            }

            if(!str.equals("") && i==(inputString.length()-1)) {
                if (wordsToCounts.containsKey(str))
                    wordsToCounts.put(str, wordsToCounts.get(str) + 1);
                else wordsToCounts.put(str, 1);
                str = "";
            }
        }
    }

    private String sentenceCase(String str){
        System.out.println("Inside: "+str);
        if(str.length()>2){
            str=str.substring(0,1).toUpperCase()+str.substring(1,str.length());
        }
        return str;
    }

    private void populateWordsToCounts(String inputString){
        String[] arr=inputString.split("\\.| |\\?|\\!|:|\\- |, |\\(|\\)");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals("")) {
                String str = sentenceCase(arr[i]);
                if (wordsToCounts.containsKey(arr[i]))
                    wordsToCounts.put(arr[i], wordsToCounts.get(arr[i]) + 1);
                else if(wordsToCounts.containsKey(str)){
                    wordsToCounts.put(str, wordsToCounts.get(str) + 1);
                }
                else wordsToCounts.put(arr[i], 1);

            }
        }
    }

    public WordCloud(String inputString) {
        populateWordsToCounts(inputString);
    }

    public Map<String, Integer> getWordsToCounts() {
        return wordsToCounts;
    }

    public static void main(String[] args){
        final String text = "Mmm...mmm...decisions...decisions";
        WordCloud wc=new WordCloud(text);
        System.out.println(wc.getWordsToCounts());
    }
}
