package problemsolving.cf4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i]=in.nextInt();
            }

            for (int i=n-1; i>=0; i--){
                if(i%2==0){
                    System.out.print(-arr[i]+" ");

                }else{
                    System.out.print(arr[i]+" ");
                }

            }
            System.out.println();
        }


    }


}
