public class NthFibonacci {
    public static void main(String[] args)
    {
        for(int i=1;i<11;i++) {
            System.out.println(fib_alt(i));
        }
    }

    private static int fib_alt(int n){
        double A=(1+Math.sqrt(5))/2;
        double B=(1-Math.sqrt(5))/2;
        double res=(Math.pow(A,n)-(Math.pow(B,n)))/(Math.sqrt(5));
        return (int)res;
    }

    private static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Need non-negative number");
        }

        int first = 0, second = 1, iter = 0;
        while (iter++ < n) {
            int temp = first + second;
            second = first;
            first = temp;
        }

        return first;
    }
}