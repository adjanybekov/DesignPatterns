package problemsolving.cf5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q4 {


private static final int MOD = 998244353;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]arr=new int[2*n];
        for(int i=0; i<2*n; i++){
            arr[i] =in.nextInt();
        }

        Arrays.sort(arr);

        int sum1=0,sum2=0;

        for(int i=0; i<n; i++){
            sum1+=arr[i];
            sum1 = Math.floorMod(sum1,MOD);
            sum2+=arr[n+i];
            sum2 = Math.floorMod(sum2,MOD);
        }
        int total = Math.floorMod( Math.abs(sum1-sum2),MOD);

//        System.out.println(total);
//        System.out.println(nCr(2*n,n));
        System.out.println(Math.floorMod(total*nCr(2*n,n),MOD));

    }

    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = Math.floorMod(res * i,MOD);
        return res;
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



    public static long choose(long total, long choose){
        if(total < choose)
            return 0;
        if(choose == 0 || choose == total)
            return 1;
        return choose(total-1,choose-1)+choose(total-1,choose);
    }
    static int comb(int n, int r) {
        if (n < 1) return 0;   // as you required, F(0) = 0
        if (n == 1 || r < 1) return 1;
        int[] a = new int[r + 1];
        a[r] = a[r-1] = 1;     // however, for F(2..) we must have F(0) = 1
        for (int i = 2; i <= n; i++) {
            int x = a[0];
            for (int j = 1; j <= r; j++) {
                x = Math.floorMod(x+a[j],MOD);
                a[j-1] = a[j];
            }
            a[r] = x;
        }
        return a[r];
    }
}
