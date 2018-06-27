import java.util.Arrays;

public class MakingChange {
    public static void main(String[] args){
        int[] denom={1,2,3,5};
        int amount = 5;
        System.out.println(noOfWays(denom,amount));
    }

    public static int noOfWays(int[] denom, int amount){
        int[] res=new int[amount+1];
        res[0]=1;
        for(int i=0;i<denom.length;i++){
            System.out.println(denom[i]);
            for(int j=denom[i];j<res.length;j++){
                res[j]=res[j]+res[j-denom[i]];
            }
            System.out.println(Arrays.toString(res));
        }
        return res[res.length-1];
    }
}