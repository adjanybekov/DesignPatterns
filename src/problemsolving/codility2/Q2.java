package problemsolving.codility2;

import java.util.*;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        int[] A={1,4,7,3,3,5};
        System.out.println(solution(A));
        System.out.println(solution2(A));

    }


    private static int solution2(int[]A){
        int n=A.length;
        int[][] arr = new int[n][2];

        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            arr[i][0]=A[i];
            arr[i][1]=i;
            List<Integer> l = map.getOrDefault(A[i],new ArrayList<>());
            l.add(i);
            map.put(A[i],l);
        }

        Arrays.sort(arr,(a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n-1; i++){
            if(arr[i][0]!=arr[i+1][0]){
                if(map.get(arr[i][0]).size()==1 &&map.get(arr[i+1][0]).size()==1){
                    res=Math.min(res,Math.abs(arr[i][1]-arr[i+1][1]) );
                }else{
                    int mind1=map.get(arr[i][0]).get(0);
                    int maxd1=map.get(arr[i][0]).get(map.get(arr[i][0]).size()-1);

                    int mind2=map.get(arr[i+1][0]).get(0);
                    int maxd2=map.get(arr[i+1][0]).get(map.get(arr[i+1][0]).size()-1);

                    res = Math.min(res,Math.abs(mind1-mind2));
                    res = Math.min(res,Math.abs(mind1-maxd2));
                    res = Math.min(res,Math.abs(maxd1-mind2));
                    res = Math.min(res,Math.abs(maxd1-maxd2));
                }

            }
        }
        if(res==Integer.MAX_VALUE)return -1;
        return res;
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int n=A.length;
        Set<Integer> set = new HashSet<>(Arrays.stream(A).boxed().collect(Collectors.toList()));

        int res=Integer.MAX_VALUE;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){

                if(A[i]!=A[j]){ //if there is no
                    boolean flag = true;
                    for(int k=Math.min(A[i],A[j])+1; k<Math.max(A[i],A[j]);k++){
                        if(set.contains(k)){
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        res=Math.min(res,Math.abs(i-j));
                    }
                }
            }
        }
        if(res==Integer.MAX_VALUE)return -1;
        return res;
    }
}
