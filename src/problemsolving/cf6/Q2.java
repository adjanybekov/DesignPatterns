package problemsolving.cf6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int a= in.nextInt();
            int b = in.nextInt();
            String s = in.next();
            List<Pair> l = new ArrayList<>();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    int start=i;
                    while(i<s.length() && s.charAt(i)=='1'){
                        i++;
                    }
                    int end=i;
                    Pair pair = new Pair(start,end);
                    l.add(pair);
                }
            }

            long totalPrice = l.size()*a;

            for (int i=0; i<l.size()-1; i++){
                int dist = l.get(i + 1).s - l.get(i).e;
                if(  dist*b < a){
                    totalPrice = totalPrice-a+(dist*b);
                }
            }
            System.out.println(totalPrice);


        }
    }

    static class Pair{
        int s;
        int e;
        Pair(int st, int en){
            s=st;
            e=en;
        }
    }

}
