import java.util.Arrays;

public class TopScores {
    public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

        int[] arr=new int[highestPossibleScore+1];
        for(int i=0;i<unorderedScores.length;i++){
            if(arr[unorderedScores[i]]==0)arr[unorderedScores[i]]=1;
            else {
                arr[unorderedScores[i]]++;
            }
        }
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>0){
                for(int j=0;j<arr[i];j++){
                    unorderedScores[index]=i;
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(unorderedScores));
        return unorderedScores;
    }

    public static void main(String[] args){
        final int[] scores = {37, 89, 41, 65, 91, 53};
        final int[] actual = sortScores(scores, 100);
    }
}
