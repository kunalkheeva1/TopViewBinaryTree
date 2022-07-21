import java.util.*;

public class TopViewBinaryTree {

// node class
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
    // pair class to hold the nodes and the values respectively
    class Pair{
        int val;
        Node node;
        Pair(int val, Node node){
            this.val = val;
            this.node = node;
        }
    }

    // top view method, take a TreeMap first to store the elements with maintained order
    public List<Integer> topViewBinaryTree(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Pair> q = new LinkedList<>();
        Pair pair = new Pair(0, root);
        q.add(pair);

        while (!q.isEmpty()) {

            //remove the pair from  queue and then gather its data
            Pair pp = q.remove();
            Node current = pp.node;
            int value = pp.val;

            // issue some values wrt the datas and then add them in the queue respectively
            if(current.left != null){
                Pair p1 = new Pair(value -1, current.left);
                q.add(p1);
            }
            if(current.right != null){
                Pair p2 = new Pair(value +1, current.right);
                q.add(p2);
            }
            // if map does not contain that value then dont add it, otherwise go ahead
            if(map.containsKey(value) == false){
                map.put(value, current.data);
            }



        // method to iterate through the map and then put the elements in the list and then print it
        }for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;



    }

    public static void main(String[] args) {

    }
}
