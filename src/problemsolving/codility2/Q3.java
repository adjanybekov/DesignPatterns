package problemsolving.codility2;

import java.util.*;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        int[] A={2,4,1,6,5,9,7};
        System.out.println(solution(A));
        int[] B={4,3,2,6,1};
        System.out.println(solution(B));
        int[] C={2,1,6,4,3,7};
        System.out.println(solution(C));
//        System.out.println(solution2(A));

    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
        int n=A.length;


        //in the range seen so far do I see all elements that must be there?
        int[] B = new int[n];
        for(int i=0; i<n; i++){
            B[i]=A[i];
        }
        Arrays.sort(B);

        int res=0;

        int start=0;
        for(int i=0; i<n-1; i++){
            if(A[i]<A[i+1]){
                boolean check = check(A, B, i+1, start);
//                System.out.println(check);
                if(check(A,B,i,start)){
                    res++;
                    start=i;
                }
            }
        }

        if(A[n-1]==B[n-1])res++;
        return res;

    }

    //is numbers in a until i exist in b until i
    private static boolean check(int[] a, int[] b, int end, int start) {
//        System.out.println("end:"+b[end]);
        for(int i=start; i<end; i++){
            if(a[i]>b[end]){
                return false;
            }
        }
        return true;
    }
}
