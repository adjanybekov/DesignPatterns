package problemsolving.cf5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

    public static List<Integer> findDivisors(long n)
    {
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i * i < n; i++)
        {
            if (n % i == 0){
                l.add(i);
            }

        }

        for(int i = (int)Math.sqrt(n);
            i >= 1; i--)
        {
            if (n % i == 0){
                l.add((int)n/i);
            }

        }
        return l;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
           long p = in.nextLong();
           long q = in.nextLong();
            List<Integer> divisors = findDivisors(p);
            int res=0;
            for(int i=divisors.size()-1; i>=0; i--){
                if(Math.floorMod(divisors.get(i),q)!=0 ){
                    res=divisors.get(i);
                    break;
                }
            }
//            System.out.println(divisors);
            System.out.println(res);


        }
    }
}
