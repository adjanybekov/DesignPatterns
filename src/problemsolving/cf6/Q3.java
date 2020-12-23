package problemsolving.cf6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n= in.nextInt();
            List<Pair> l = new ArrayList<>();
            int[]a=new int[n];
            int[]b=new int[n];
            for (int i=0; i<n; i++){
              a[i]=in.nextInt();
            }
            for (int i=0; i<n; i++){
              b[i]=in.nextInt();
            }
            for (int i=0; i<n; i++){
              Pair p = new Pair(b[i],a[i]);
              l.add(p);
            }
            Collections.sort(l,(o1,o2)->o1.c-o2.c);
//            System.out.println(l);

            int i=n-1;
            long pT=0;
            for (; i>=0; i--){

                //bringing petya is cheaper than bringing courier
                if(pT+l.get(i).p<l.get(i).c){
                    pT+=l.get(i).p;
                }else{
                    break;
                }
            }
            if(i>=0){
                System.out.println( Math.max(l.get(i).c,pT ));
            }else{
                System.out.println(pT);
            }
/*
*
1
9
82 47 64 25 30 26 10 89 59
38 59 47 37 73 33 12 88 92
* */



        }
    }

    static class Pair{
        int p;
        int c;
        Pair(){};
        Pair(int P, int C){
            p=P;
            c=C;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "p=" + p +
                    ", c=" + c +
                    '}';
        }
    }

}
