package problemsolving.cf3;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[]arr=new int[n];
            Map<Integer, LinkedList<Integer>> map = new HashMap<>();

            int center = -1;
            for(int i=0; i<n; i++){
               arr[i]= in.nextInt();
               LinkedList<Integer> l = map.getOrDefault(arr[i],new LinkedList<>());
               l.add(i+1);
               map.put(arr[i],l);
            }

            boolean possible=true;

            for(int key:map.keySet()){
                if(map.get(key).size()==n){
                    possible=false;
                    break;
                }
            }


            if(!possible){
                System.out.println("NO");
            }else{
                int ia=0,ib=-1;
                for(int i=0; i<n; i++){
                    if(arr[i]!=arr[ia]){
                        ib=i;
                        break;
                    }
                }
                System.out.println("YES");
                for(int i=1; i<n; i++){
                    if(arr[i]==arr[ia]){
                        System.out.println( (ib+1)+" "+ (i+1));
                    }else{
                        System.out.println( (ia+1)+" "+ (i+1));
                    }
                }

            }
        }
    }

}
