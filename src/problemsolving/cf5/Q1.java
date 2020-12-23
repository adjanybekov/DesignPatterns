package problemsolving.cf5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int x = in.nextInt();

            int[] arrN = new int[n];
            int[] arrM = new int[n];

            long tot = 0;
            for(int i=0; i<n; i++){
                arrN[i]= in.nextInt();
            }
            for(int i=0; i<n; i++){
                arrM[i]= in.nextInt();
            }

            Arrays.sort(arrM);
            Arrays.sort(arrN);
//            Arrays.stream(arrN).boxed()
//                    .sorted(Collections.reverseOrder())
//                    .mapToInt(Integer::intValue)
//                    .toArray();

//            System.out.println(Arrays.toString(arrM));
//            System.out.println(Arrays.toString(arrN));
            boolean flag=true;
            for(int i=0; i<n; i++){
                if(arrM[i]+arrN[n-i-1]>x){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
