package problemsolving.cf4;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();

            if(isPrime(n)){
                for (int i=0; i<n; i++){
                    for(int j=0; j<n; j++){
                        System.out.print("1 ");
                    }
                    System.out.println();
                }
            }else{
                int i=n;
                for(; ; i++){
                    if(isPrime(i) && !isPrime(i-(n-1))){
                        break;
                    }
                }
//                System.out.println("I="+i);
                for (int k=0; k<n; k++){
                    for(int j=0; j<n; j++){
                        if(j==k){
                            System.out.printf("%d ",i-(n-1) );
                        }else{
                            System.out.print("1 ");
                        }

                    }
                    System.out.println();
                }
            }





        }
    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
