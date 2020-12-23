package problemsolving.cf3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int l=-1, r=-1, count=0;
            int[]arr=new int[n];
            for(int i=0; i<n; i++){
               arr[i]= in.nextInt();
            }

            for(int i=0; i<n; i++){
               if(arr[i]==1 && l==-1){
                   l=i;
                   r=i;
               }else if(arr[i]==1){
                   r=i;
               }
            }

            for(int i=l; i<r; i++){
                if(arr[i]==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
