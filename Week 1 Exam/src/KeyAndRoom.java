import java.util.Arrays;
import java.util.List;

public class KeyAndRoom {
    public static void main(String[] args){
        int[][][] arr={{{1},{0,2},{3}},{{1,3},{3,0,1},{2},{0}},{{1,2,3},{0},{0},{0}},{{1},{0,2,4},{1,3,4},{2},{1,2}},{{1},{2,3},{1,2},{4},{1},{5}},{{1},{2},{3},{4},{2}},{{1},{1,3},{2},{2,4,6},{},{1,2,3},{1}}};
        for(int a=0;a<arr.length;a++) {
            System.out.println("TestCase "+a+":"+access(arr[a]));
        }
    }

    public static boolean access(int[][] arr){
        boolean[] marked=new boolean[arr.length];
        marked[0]=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int x=arr[i][j];
                if(x<marked.length) {
                    if (!marked[x] && x!=i) marked[x] = true;
                }
            }
        }

        for(int k=0;k<marked.length;k++){
            if(!marked[k])return false;
        }
        return true;
    }
}
