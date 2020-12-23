package problemsolving;

import java.util.*;

public class CF1Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            boolean flag=false;
            for (int a=0; a<=n/3; a++){
                for(int b=0; b<=n/5; b++){

                    if( (n-(a*3+b*5)) %7 ==0 ){
                        int c = (n-(a*3+b*5) )/7;
                        System.out.println(String.format("%d %d %d",a,b,c));
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(!flag)
            System.out.println(String.format("-1"));

        }
    }
}
