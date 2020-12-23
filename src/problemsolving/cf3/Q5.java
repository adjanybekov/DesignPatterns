package problemsolving.cf3;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t==2){
            System.out.println(1);
        }else{

            long res = 2*factorial(t)/((long)Math.pow(t,2));
            System.out.println(res);
        }


    }

    static long factorial(long n) {
        long fact = 1;
        long i = 1;
        while(i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }
    static int comb(int n, int r) {
        if (n < 1) return 0;   // as you required, F(0) = 0
        if (n == 1 || r < 1) return 1;
        int[] a = new int[r + 1];
        a[r] = a[r-1] = 1;     // however, for F(2..) we must have F(0) = 1
        for (int i = 2; i <= n; i++) {
            int x = a[0];
            for (int j = 1; j <= r; j++) {
                x += a[j];
                a[j-1] = a[j];
            }
            a[r] = x;
        }
        return a[r];
    }

}
