package problemsolving.leetcode;

import java.util.Stack;

public class Decode {

    public static void main(String[] args) {

        String s = decodeString("3[a]2[bc]");
//        String s = decodeString("3[a2[c]]");
//        String s = decodeString("2[abc]3[cd]ef");
//        String s = decodeString("abc3[cd]xyz");
        System.out.println(s);
    }
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); ){
            if(Character.isDigit(s.charAt(i))){
                System.out.println("i:"+i);
                System.out.println(s.substring(i));
                int start  = s.substring(i).indexOf('[');
                int end = i;
                Stack<Character> st = new Stack<>();
                st.push('[');
                int j=i+start+1;
                while(!st.isEmpty()){
                    if(s.charAt(j)=='['){
                        st.push('[');
                    }else if(s.charAt(j)==']'){
                        st.pop();
                    }
                    j++;
                }
                end=j-1;


                System.out.println("start:"+(start+i) );
                System.out.println("end:"+ (end));
//                System.out.println(s.substring(start+1,end));
                String number = s.substring(i, i+start);
                System.out.println("number:"+number);
                int n=Integer.valueOf(number);
                sb.append( decodeString(s.substring(i+start+1,end)).repeat(n));
                i=end;
                i++;

            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }

}
