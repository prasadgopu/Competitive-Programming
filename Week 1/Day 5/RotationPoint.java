public class RotationPoint {
    public static int findRotationPoint(String[] words) {
        if (words.length==0) {
            return -1;
        }
        String pivot = words[0];
        int low = 0;
        int high = words.length-1;
        int mid;
        while(low <= high){
            mid = (low+high)/2;
            if (pivot.compareTo(words[mid])>=1) {
                if (words[mid].compareTo(words[mid-1]) <= -1) {
                    return mid;
                }
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return 0;
    }
}