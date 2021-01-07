package problemsolving.codility2;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(125));
        System.out.println(solution(1));
        System.out.println(solution(10));
    }

    public static int solution(int N) {
        // write your code in Java SE 8

        //find length of number
        int len  = String.valueOf(N).length();
        if(len==1){
            return 0;
        }
        return (int)Math.pow(10,len-1);
    }
}
