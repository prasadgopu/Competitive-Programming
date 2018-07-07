public class ReverseWords {
    public static void reverseWords(char[] message) {
        int i=0,j=0;
        while (i<message.length && j<message.length){
            if(j==message.length-1){
                reverseEach(message,i,j);
                j++;
                i=j;
            } else if(message[j]!=' '){
                j++;
            }
            else {
                System.out.println(i+" "+j);
                reverseEach(message,i,j-1);
                j++;
                i=j;
            }
        }
        System.out.println(message);
        i=0;
        j=message.length-1;
        reverseEach(message,i,j);
    }

    public static void reverseEach(char[] message, int i, int j){
        while (i<j){
            char temp=message[i];
            message[i]=message[j];
            message[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        char[] message="chocolate bundt cake is yummy".toCharArray();
        reverseWords(message);
    }
}