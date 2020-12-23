package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class CF3Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();

            System.out.println(2);

            if(n==2){
                System.out.println("1 2");
            }
            else if(n==3){
                System.out.println("1 3");
                System.out.println("2 2");
            }
            else{
                System.out.println(String.format("%d %d",n-2,n));
                System.out.println(String.format("%d %d",n-1,n-1));
                for (int i=1; i<n-2;i++){
                    System.out.println(String.format("%d %d",n-2-i,n-i));
                }
            }

        }
    }
}
