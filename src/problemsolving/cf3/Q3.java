package problemsolving.cf3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[]arr=new int[n];
            int max=0;
            for(int i=0; i<n; i++){
               arr[i]= in.nextInt();
               max=Math.max(max,arr[i]);
            }

            int res=-1;
            for(int i=0; i<n; i++){
                if(arr[i]==max){
                    if(i>0 && arr[i-1]<max){
                        res=i;
                        break;
                    }else if(i<n-1 && arr[i+1]<max){
                        res=i;
                        break;
                    }
                }
            }
            System.out.println(res==-1?-1:res+1);
        }
    }
}
