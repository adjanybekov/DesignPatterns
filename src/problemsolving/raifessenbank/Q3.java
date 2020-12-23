package problemsolving.raifessenbank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Q3 {
    static class Node{
        char val;
        Node next;
        Node prev;
        public Node(char val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s = in.next();
            int n = s.length();
            Node head = createList(s);
            if(n<=1){
                System.out.println(n);
            }else{

                Node tmp = head;
                int count=0;
                while(tmp!=null && tmp.next!=null && tmp.next.next!=null){
                    if(toString(tmp).equals("AB")||toString(tmp).equals("BB")){
                        count+=2;
                        if(tmp.prev==null){
                            tmp = tmp.next.next;
                            tmp.prev=null;
                            head=tmp;
                        }else{ //tmp.prev!=null
                            tmp = tmp.prev;
                            tmp.next = tmp.next.next.next;
//                            head=tmp;
                        }
                    }else{
                        tmp=tmp.next;
                    }
                }
//                printList(head);
                if(tmp!=null && tmp.next!=null && (toString(tmp).equals("AB")||toString(tmp).equals("BB") ) ){
                    count+=2;
                }
                System.out.println(n-count);


            }

        }
    }
    private static  String toString(Node n){
        return n.val+""+n.next.val;
    }

    private static  void printList(Node node){

        Node tmp=node;
        while (tmp!=null){
            System.out.print(tmp.val+",");
            tmp=tmp.next;
        }
//        return head;
    }
    private static  Node createList(String s){
        Node head=new Node(s.charAt(0));
        Node tmp=head;
        for(int i=1; i<s.length(); i++){
            Node n = new Node(s.charAt(i));
            tmp.next=n;
            n.prev=tmp;
            tmp = n;
        }
        return head;
    }
}
