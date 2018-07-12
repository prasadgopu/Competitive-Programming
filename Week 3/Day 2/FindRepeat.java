public class FindRepeat {
    public static void main(String[] args){

    }

    public static int findRepeat(int[] theArray) {
        for(int i=0;i<theArray.length;i++)
        {
            theArray[theArray[i]%theArray.length]+=theArray.length;
        }
        int ans=-1;
        for(int i=0;i<theArray.length;i++)
        {
            if(theArray[i]/theArray.length>1)
            {
                ans=i;
            }
            theArray[i]=theArray[i]%theArray.length;
        }
        return ans;
    }
}
