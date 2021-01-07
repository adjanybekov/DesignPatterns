package problemsolving.codility;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 1, 2};
        int solution = solution(arr);
        System.out.println(solution);
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        int i=0;
        int n=A.length;
        //pass negatives
        for(;i<n; i++){
            if(A[i]<=0){
                continue;
            }else{
                break;
            }
        }
        int j=1;
//        System.out.println(A[i]+","+j);
        for(;i<n;){
            //pass duplicates
            while(i+1<n && A[i]==A[i+1]){
                i++;
            }

            if(A[i]!=j && j!=0){
                return j;
            }
            i++;j++;
        }
        return A[n-1]+1;
    }
}
