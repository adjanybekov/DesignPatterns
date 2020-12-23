package problemsolving.cf8;

import java.util.*;

public class Q3 {
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){

            int res = solve();
            System.out.println(res);
        }
    }

    private static int solve(){

        int n = in.nextInt();

        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            int num = in.nextInt();
            arr[i]=num;

        }
        List<Integer> l = new ArrayList<>();
        for(int i=0 ; i<n; i++){
            while(i+1<n && arr[i+1]==arr[i]){
                i++;
            }
            l.add(arr[i]);
        }
        if(l.size()>=2 && l.get(l.size()-1)==l.get(l.size()-2) ){
            l.remove(l.size()-1);
        }

        for (int num: l){
            map.put(num, map.getOrDefault(num,1)+1);
        }
//        System.out.println(l);

        int min = n;


        map.put(arr[n-1],map.get(arr[n-1])-1);
        map.put(arr[0],map.get(arr[0])-1);
//        System.out.println(map);
        for (int key:map.keySet()){


            min = Math.min(min, map.get(key));

        }
        return min;


    }

    private static int partition(int key, List<Integer> list, int n, int[] arr) {

        int parts=0;
        int i =0,r=n;
        List<Integer> l = new ArrayList<>();
        for(; i<list.size()-1; i++){
            if(i<list.size()-1 && list.get(i)==list.get(i+1)){
                i++;
            }

            parts++;
        }
//        parts++;
        if(list.get(list.size()-1)!=key){
            parts++;
        }
        int remove = (arr[0]==key || arr[n-1]==key)?0:(arr[0]==key && arr[n-1]==key)?-1:1;
        return parts+remove;
    }
}
