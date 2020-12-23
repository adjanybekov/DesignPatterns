package problemsolving.raifessenbank;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String s = in.next();

            boolean same = same(s);
//            System.out.println(same);
            if(same){
                System.out.println(n);
            }else{
                Set<Integer> set = new HashSet<>();

                for(int i=0; i<n; i++){
                   if(s.charAt(i)=='-'){
                       set.add(i);
                       set.add(Math.floorMod(i+1,n));
                   }
                }
                System.out.println(set.size());
            }

        }
    }

    private static boolean same(String s){
        boolean allClockwise=true;
        boolean allCcw=true;

        for (char c: s.toCharArray()){
            if(c=='>' || c=='-'){
               continue;
            }else{
                allClockwise=false;
                break;
            }
        }

        for (char c: s.toCharArray()){
            if(c=='<' || c=='-'){
               continue;
            }else{
                allCcw=false;
                break;
            }
        }


        return allCcw||allClockwise;
    }
}
