package problemsolving.leetcodefree;

import java.util.*;

public class UniqueSubstring {
    //find
    public static void main(String[] args) {
        List<String> l1 = solve("abcabc", 3);
        System.out.println(l1);
        List<String> l2 = solve("abacab", 3);
        System.out.println(l2);
        List<String> l3 = solve("awaglknagawunagwkwagl", 4);
        System.out.println(l3);
    }


    private static List<String> solve(String s, int k){

        Set<String> set=new HashSet<>();

        for(int i=0; i<s.length()-k; i++){
//            if(s.substring(i,i+k)) contains unique letters
            String sub = nextUnique(s, i, k);
            if(sub!=null){
                set.add(sub);
            }

        }

        List<String> l = new ArrayList<>(set);
        return l;
    }

    //find first string with length k
    private static String nextUnique(String s, int start, int k){
        Map<Character,Integer> map = new HashMap<>();
        int l=start;
        for(int i=start; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                l=Math.max(map.get(c)+1,l-1);
            }
            if(i-l+1 == k){
                return s.substring(l,i+1);
            }
            map.put(c,i);
        }
        return null;
    }
}
