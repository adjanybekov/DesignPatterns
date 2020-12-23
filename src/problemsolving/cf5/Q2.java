package problemsolving.cf5;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
           int a = in.nextInt();
           int b = in.nextInt();
           int c = in.nextInt();
           int d = in.nextInt();

            System.out.println(Math.max(a+b,c+d));
        }
    }
}
