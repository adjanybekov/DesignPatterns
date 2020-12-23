package problemsolving;
import java.lang.*;
import java.util.Scanner;

public class Main {

    static int bubbleSort(int arr[])
    {   int count=0;
        int n = arr.length;
        String s = "";
        s.indexOf("");
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                { count++;
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return count;
    }
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }
            int res = bubbleSort(arr);
            if(res<= ((n*(n-1))/2 -1) ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


    }
}
