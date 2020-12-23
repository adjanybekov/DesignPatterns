package problemsolving;

import java.util.*;
import java.util.HashMap;

public class CF4Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        StringBuilder sb = new StringBuilder(s);
        int res=0;//min number of operations to reverse string by swapping

        StringBuilder sb2 = new StringBuilder();

        Map<Character, Stack<Integer>> map  =new HashMap<>();


        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.get(c).add(i);
            }else{
                map.put(c,new Stack<>());
                map.get(c).add(i);
            }
        }

        System.out.println(map);
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
//            int lastIndexOf = sb.lastIndexOf(c + "");
//            res+=sb.length()-lastIndexOf-1;
//            sb2.append(sb.charAt(lastIndexOf));
//            sb.deleteCharAt(lastIndexOf);
//            System.out.println(sb+","+sb2);
            Integer index = map.get(c).pop();
            System.out.println(n-index-1);
            res+=(n-index);
        }
        System.out.println(map);
        System.out.println(res);


    }
}
