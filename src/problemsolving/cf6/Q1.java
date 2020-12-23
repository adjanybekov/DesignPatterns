package problemsolving.cf6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    private static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            List<Integer> l = new ArrayList<>();

            for(int i=4*n; i>=4; i-=2){
                if(l.isEmpty()){
                    l.add(i);
                }else{

                    //take canditate check if suits and then add to list
                    if(check(i,l)){
                        l.add(i);
                    }

                }
            }
//            System.out.println(l.size());

            for (int i=0; i<n; i++){
                System.out.print(l.get(i)+" ");
            }
            System.out.println();
        }
    }

    static boolean check(int cand, List<Integer>l){
//        System.out.println(cand);
//        System.out.println(l);
        for (int k:l){
            if(Math.floorMod(k,cand)==0){
                return false;
            }
        }
        return true;
    }
}
