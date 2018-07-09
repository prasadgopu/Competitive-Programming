public class WhichAppearsTwice {
    public static void main(String[] args){
        final int[] numbers = {1, 5, 9, 7, 2, 6, 3, 8, 2, 4};
        findRepeat(numbers);
    }

    public static int findRepeat(int[] numbers) {
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        int n=numbers.length-1;
        sum=sum-(n*(n+1)/2);
        return sum;
    }
}
