import java.util.*;

public class TopViewBinaryTree {


    class Node{
        int data;
        Node right;
        Node left;
        Node(int data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    class Pair{
        int val;
        Node node;
        Pair(int val, Node node){
            this.val = val;
            this.node = node;
        }

    }

    public List<Integer> topViewBinaryTree(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Pair> q = new LinkedList<>();
        Pair pair = new Pair(0, root);
        q.add(pair);

        while (!q.isEmpty()) {

            Pair pp = q.remove();
            Node current = pp.node;
            int value = pp.val;

            if(current.left != null){
                Pair p1 = new Pair(value -1, current.left);
                q.add(p1);
            }
            if(current.right != null){
                Pair p2 = new Pair(value +1, current.right);
                q.add(p2);
            }
            if(map.containsKey(value) == false){
                map.put(value, current.data);
            }




        }for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;



    }

    public static void main(String[] args) {

    }
}
