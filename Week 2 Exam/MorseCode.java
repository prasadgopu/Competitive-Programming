import java.util.HashMap;

public class MorseCode {

    public static HashMap<Character,String> map=new HashMap<>();

    public static void main(String[] args){
        map.put('A',".-");
        map.put('B',"-...");
        map.put('C',"-.-.");
        map.put('D',"-..");
        map.put('E',".");
        map.put('F',"..-.");
        map.put('G',"--.");
        map.put('H',"....");
        map.put('I',"..");
        map.put('J',".---");
        map.put('K',"-.-");
        map.put('L',".-..");
        map.put('M',"--");
        map.put('N',"-.");
        map.put('O',"---");
        map.put('P',".--.");
        map.put('Q',"--.-");
        map.put('R',".-.");
        map.put('S',"...");
        map.put('T',"-");
        map.put('U',"..-");
        map.put('V',"...-");
        map.put('W',".--");
        map.put('X',"-..-");
        map.put('Y',"-.--");
        map.put('Z',"--..");



        String[][] arr={{"gin","zen","gig","msg"},{"a","z","g","m"},{"bhi","vsv","sgh","vbi"},{"a","b","c","d"},{"hig","sip","pot"}};

        for(int i=0;i<arr.length;i++){
            HashMap<String,Integer> result=new HashMap<>();
            for(int j=0;j<arr[i].length;j++) {
                String temp = convertMorse(arr[i][j]);
                if (result.containsKey(temp)) {
                    result.put(temp, (int) result.get(temp) + 1);
                } else {
                    result.put(temp, 1);
                }
            }
            System.out.println(result.size());
        }


    }

    public static String convertMorse(String input){
        String str="";
        for(int j=0;j<input.length();j++){
            char key=input.charAt(j);
            char Upper_key=(char)((int)key-32);
            if(map.containsKey(Upper_key)){
                str=str.concat(map.get(Upper_key));
            }
        }
        return str;
    }
}
