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

    public static void main(String[] args) {

    }
}
