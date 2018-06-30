import java.util.HashMap;
import java.util.Map;

public class InFlight {
    public static void main(String[] args){
        int time=6;
        int[] arr={2, 3, 5};
        System.out.println(canTwoMoviesFillFlight(arr,time));
    }

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength){
        if(movieLengths.length<=0)return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        int first=movieLengths[0];
        for(int i=0;i<movieLengths.length;i++){
            if(map.containsKey(movieLengths[i]))
            {
                map.put(movieLengths[i],map.get(movieLengths[i])+1);
            }
            else map.put(movieLengths[i],1);
        }


        for(Map.Entry m:map.entrySet()){
            int value = (int) m.getValue();
            int key = (int) m.getKey();
            int remaining = flightLength-key;
            if (key==remaining && value>1) return true;
            if(map.containsKey(remaining) && remaining!=key){
                return true;
            }
        }

        return false;
    }


}