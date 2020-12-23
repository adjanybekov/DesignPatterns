package problemsolving.cf8;

import java.util.HashMap;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int arr[] = new int[n+1];
            HashMap<Integer,Integer> minIndex= new HashMap<>();
            for(int i=0; i<n; i++){
                int index = in.nextInt();
                arr[index]++;
                minIndex.put(index, minIndex.getOrDefault(index,i+1));
            }
            int min=n;

            boolean found=false;

            for(int i=1; i<=n; i++){
              if(arr[i]==1){
                  System.out.println(minIndex.get(i));
                  found=true;
                  break;
              }
            }
            if(!found){
                System.out.println(-1);
            }
        }
    }
}
