import java.util.Arrays;

public class HighestProduct3 {
    public static void main(String[] args){
        int[] arr={-5,-1,-3,-2};
        HighestProduct3 hg=new HighestProduct3();
        System.out.println(hg.highproduct(arr));

    }

    public int highproduct(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result=arr[arr.length-2]*arr[arr.length-1]*arr[arr.length-3];
        int z=result;
        if(arr[0]>=0 || (arr[0]<0 && arr[1]>=0)){
            z=result;
        }
        else {
            int temp_result=0;
            if(arr[0]<0 && arr[1]<0){
                temp_result=arr[0]*arr[1]*arr[arr.length-1];
                if(temp_result>result){
                    z=temp_result;
                }
            }
        }
        return z;
    }
}