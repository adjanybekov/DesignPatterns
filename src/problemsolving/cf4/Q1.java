package problemsolving.cf4;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int m = in.nextInt();

            int[] arr = new int[n];

            long tot = 0;
            for(int i=0; i<n; i++){
                arr[i]= in.nextInt();
                tot+=arr[i];
            }

            if(tot==m){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
