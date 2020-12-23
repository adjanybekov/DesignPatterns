package problemsolving.cf3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String s = String.valueOf(n);
            int i = Integer.valueOf(s.charAt(0)+"") - 1;
//            System.out.println(i);
            int res = 10* i + (s.length()*(s.length()+1))/2;
            System.out.println(res);
        }
    }
}
