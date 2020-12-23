package problemsolving.cf4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    static long factorial(long n) {
        long fact = 1;
        long i = 1;
        while(i <= n) {
            fact *= i;
            fact = Math.floorMod(fact,mod);
            i++;
        }
        return fact;
    }

    static final long mod = 1000000000+7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int pos = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=i;
        }
        int[] arr2= {0,1,2,3,4,5,6,7,8,9};
        List<Integer>  smaller=new ArrayList<>();
        List<Integer>bigger=new ArrayList<>();
        binarySearch(arr2, pos,smaller,bigger);
        int bCount=n-x, sCount=pos;

        System.out.printf("%d %d %d %d\n",bCount,bigger.size(),sCount,smaller.size());

        long res = factorial(bCount)*factorial(sCount)*choose(bigger.size(),bCount) *choose(smaller.size(),sCount);
        System.out.println(res);
    }

    public static long choose(long total, long choose){
        if(total < choose)
            return 0;
        if(choose == 0 || choose == total)
            return 1;
        return Math.floorMod(choose(total-1,choose-1)+choose(total-1,choose),mod);
    }

    private static void binarySearch(int arr[], int x,List<Integer>  smaller,List<Integer>bigger)
    {

        int l = 0, r = arr.length;
        while (l < r) {
            int m = (r + l) / 2;
            // Check if x is present at mid
//            System.out.println(m);
            if (arr[m] <= x){
                smaller.add(m);
                l=m+1;
            }else{
                bigger.add(m);
                r = m ;
            }
        }

    }
}
