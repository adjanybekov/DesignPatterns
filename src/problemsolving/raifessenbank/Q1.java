package problemsolving.raifessenbank;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();

            int y2=in.nextInt();

            if(x1==x2){
                System.out.println(Math.abs(y1-y2));
            }else if(y1==y2){
                System.out.println(Math.abs(x1-x2));
            }else{
                System.out.println(Math.abs(x1-x2)+Math.abs(y1-y2)+2);
            }
        }
    }
}
