package problemsolving.cf8;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
//
//            int l=1,r=n;
//            for (int i=0; i<n; i++){
//                if(i%2==0){
//                    System.out.print(r+" ");
//                    r--;
//                }else{
//                    System.out.print(l+" ");
//                    l++;
//                }
//            }

            if(n%2==0){
                for (int i=n; i>0; i--){
                    System.out.print(i+" ");
                }
            }else{
                System.out.print( (n/2+1)+" ");
                for(int i=n;i>0; i--){
                    if(i!= (n/2+1))
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
