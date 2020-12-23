package problemsolving.codesignal;

public class ConcatenationSum {

    public static void main(String[] args) {
//        int[] a = {10,2};
        int[] a = {1,2,3};
        long res = concatenationsSum(a);
        System.out.println(res);
    }

    static long concatenationsSum(int[] a){


        long sum = 0;

        for(int n: a){
            sum+=n;
        }

        long productSum =0;
        for(int n:a ){
            productSum+= Math.pow(10,String.valueOf(n).length());
        }

        return sum*(a.length+productSum);
    }



}
