public class ReverseString {
    public static void reverse(char[] arrayOfChars) {
        if(arrayOfChars.length>=1){
            int i=0,j=arrayOfChars.length-1;
            while (i<j){
                char temp=arrayOfChars[i];
                arrayOfChars[i]=arrayOfChars[j];
                arrayOfChars[j]=temp;
                i++;
                j--;
            }
        }
    }
}