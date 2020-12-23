package problemsolving;

class HashMap {



    public static void main(String[] args) {

//        String[] queryType = {"insert","insert",
//                "addToValue","addToKey","get"};
//        int[][] query = {{1,2},{2,3},{2},{1},{3}};

//        String[] queryType = {"insert","addToValue",
//                "get","insert","addToKey","addToValue","get"};
//        int[][] query = {{1,2},{2},{1},{2,3},{1},{-1},{3}};


        String[] queryType = {"insert",
                "addToKey",
                "get",
                "get",
                "addToValue",
                "insert",
                "get",
                "get",
                "get",
                "addToValue",
                "insert",
                "insert",
                "addToValue",
                "addToKey",
                "get",
                "get",
                "get",
                "addToKey",
                "get",
                "insert",
                "addToKey",
                "get",
                "addToValue",
                "addToValue",
                "addToValue",
                "insert",
                "addToValue",
                "addToKey",
                "insert",
                "insert",
                "insert",
                "addToValue",
                "addToKey",
                "addToValue",
                "addToKey",
                "get",
                "addToKey",
                "insert",
                "addToValue",
                "addToKey",
                "addToKey",
                "insert",
                "addToKey",
                "addToValue",
                "addToKey",
                "addToValue",
                "insert",
                "get",
                "addToKey",
                "addToValue",
                "insert",
                "get",
                "insert",
                "addToValue",
                "get",
                "addToKey",
                "addToValue",
                "get",
                "get",
                "addToKey",
                "insert",
                "insert",
                "addToValue",
                "addToValue",
                "addToKey",
                "get",
                "get",
                "get",
                "insert",
                "insert",
                "addToKey",
                "addToValue",
                "insert",
                "addToKey",
                "addToKey",
                "addToValue",
                "addToKey",
                "get",
                "insert",
                "get"};
//                ,
//                "insert",
//                "insert",
//                "insert",
//                "addToValue",
//                "addToKey",
//                "get",
//                "addToKey",
//                "get",
//                "addToValue",
//                "addToValue",
//                "addToKey",
//                "insert",
//                "addToValue",
//                "addToKey",
//                "insert",
//                "addToKey",
//                "get",
//                "get",
//                "get",
//                "addToKey"};
        int[][] query = {{-23,44},
                {-44},
                {-67},
                {-67},
                {-5},
                {-4,17},
                {-4},
                {-67},
                {-67},
                {-48},
                {-34,-42},
                {-35,44},
                {-32},
                {-26},
                {-61},
                {-93},
                {-61},
                {-25},
                {-118},
                {17,-13},
                {-29},
                {-12},
                {-41},
                {24},
                {12},
                {38,28},
                {18},
                {47},
                {-20,-14},
                {18,-15},
                {-41,-50},
                {11},
                {22},
                {5},
                {48},
                {50},
                {-22},
                {-6,-41},
                {-33},
                {-2},
                {-10},
                {-9,8},
                {-19},
                {-27},
                {-45},
                {22},
                {-33,4},
                {-65},
                {47},
                {-46},
                {7,21},
                {-18},
                {9,47},
                {-50},
                {37},
                {6},
                {29},
                {60},
                {5},
                {40},
                {36,-13},
                {17,-5},
                {49},
                {-50},
                {2},
                {47},
                {0},
                {26},
                {-38,-31},
                {-13,-43},
                {9},
                {-9},
                {-2,-1},
                {4},
                {-48},
                {-5},
                {24},
                {-11},
                {-13,-13},
                {36}};

        long res = hashMap(queryType,query);
        System.out.println(res);

    }

    static Node insertNode(Node root,Node node,long GKO,long GVO){
        if(root==null) return node;
        Node parent = null;
        Node child= root;

        while(child!=null){

            parent=child;
            if(parent.key+GKO-parent.kO>node.key+GKO-node.kO){
                child = child.left;
            }else{
                child = child.right;
            }
        }

        if(parent.key+GKO-parent.kO>node.key+GKO-node.kO){
            parent.left = node;
        }else{
            parent.right = node;
        }

        return root;
    }


    static int getVal(Node root,int key,long GKO,long GVO){
        int val=0;

        Node cur =  root;

         while(cur!=null){

//           System.out.println( (cur.key+GKO-cur.kO)+",key:"+key);
           if(cur.key+GKO-cur.kO==key){
             return  cur.val +(int) GVO-(int)cur.vO;
           }else if(cur.key+GKO-cur.kO>key){
             cur=cur.left;
           }else{

             cur=cur.right;
           }
         }

        return val;
    }

    static long hashMap(String[] queryType, int[][] query) {

        Node root =null;
        int n=queryType.length;
        long GKO=0;
        long GVO=0;
        long res=0;
        for(int i=0; i<n; i++){
            String q = queryType[i];
            switch(q){
                case "insert":
                    int k = query[i][0];
                    int v = query[i][1];
                    Node node = new Node(k,v,GKO,GVO);
                    root = insertNode(root,node,GKO,GVO);
                    break;
                case "addToValue":
                    GVO+=query[i][0];
                    break;
                case "addToKey":
                    GKO+=query[i][0];
                    break;
                case "get":

                    int val = getVal(root,query[i][0],GKO,GVO);
                    //System.out.println("val="+val);
                    res+=val;
                    break;
            }
        }
        return res;
    }
}

class Node{
    int key;
    int val;
    long kO;
    long vO;
    Node right;
    Node left;
    Node(int k,int v, long ko,long vo){
        key = k;
        val = v;
        kO=ko;
        vO=vo;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", val=" + val +
                ", kO=" + kO +
                ", vO=" + vO +
                '}';
    }
}