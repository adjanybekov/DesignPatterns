package problemsolving.cf7;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n= in.nextInt();
            long[]arr=new long[n];

            for(int i=0; i<n; i++){
                arr[i]=in.nextLong();
            }

            long ans=0;
            for(int i=0; i<n; i++){
                int count = 0;
                for (int j=0; j<n; j++){
                    if(arr[j]>=arr[i]){
                        count++;
                    }
                }
                ans=Math.max(ans,count*arr[i]);
            }
            System.out.println(ans);
        }
    }

    private static long sumWithAvg(long[] arr, long avg) {
        long res=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=avg){
                res+=avg;
            }
        }
//        System.out.println("avg:"+avg+" res:"+res);
        return res;
    }
}
