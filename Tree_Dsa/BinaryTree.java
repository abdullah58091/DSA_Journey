package com.company.Tree_Dsa;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static  class Node {
        int data ;
        Node left ;
        Node  right ;

        Node (int data ){
            this.data = data;
            this.left =  null;
            this.right = null;
        }
    }
    static class BinaryTreeGrap {
        static int idx = -1 ;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes [idx]);
            newNode.left = buildTree(nodes);
            newNode.right =buildTree(nodes);

            return newNode;
        }
    }

        // this is traversal
    public static void preorder(Node root) {
        if(root == null) {
          //  System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // root->left->right

    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // left->root->right
    public static void postorder (Node root){
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
        //left ->right->root

    public static void levelOrder (Node root){
        if(root == null) {
            return;
        }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode == null ){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null){
                        q.add(currNode.left);
                    }
                    if (currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        // count value of nodes
        public static int  count (Node root ){
            if(root == null){
                return 0;
            }
            int leftNode = count(root.left);
            int rightNode = count(root.right);

            return leftNode +rightNode + 1;
        }

        // sum of nodes

    public static int sumOfNode (Node root ){
        if (root == null){
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);

        return  leftSum +rightSum + root.data;

    }

    // Height of tree

    public static  int Height (Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        int myHeight = Math.max(leftHeight,rightHeight) + 1;

        return myHeight;
    }

    // Diameter  Approach 01

    public static  int Diameter (Node root){
        if (root == null ){
            return 0;
        }
        int diam1 = Diameter(root.left);
        int diam2 = Diameter(root.right);
        int diam3 = Height(root.left) + Height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1 , diam2));
    }
    static class TreeInfo{
        int ht ;
        int diam;
        TreeInfo(int ht ,int diam){
            this.ht =ht;
            this.diam = diam;
        }
    }
    public static TreeInfo Diameter2(Node root){

        if (root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = Diameter2(root.left);
        TreeInfo right = Diameter2(root.right);

        int myHeight = Math.max(left.ht ,right.ht ) +1;
        int diam1 = Diameter(root.left);
        int diam2 = Diameter(root.right);
        int diam3 = left.ht  + right.ht + 1;

        int myDiam = Math.max(diam1, Math.max(diam2 ,diam3));
        TreeInfo myInfo = new TreeInfo(myHeight,myDiam);
        return new TreeInfo(myHeight,myDiam);
    }


    public boolean isIdentical(Node root,Node subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    public static void main(String[] args) {

        int nodes [] = {1,2,4,-1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTreeGrap tree = new BinaryTreeGrap();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println("---->>>> preorder traversal <<<<----- ");
        preorder(root);//time complexity is o(n)

        System.out.println();
        System.out.println("-------->>>inorder traversal <<<<-----");
        inorder(root);

        System.out.println();
        System.out.println("---->>>> postorder traversal <<<< -----");
        postorder(root);

        System.out.println();
        System.out.println("----->>>>>>level order traversal <<<<<-----");
        levelOrder(root);

        System.out.println();
        System.out.println("----->>>count <<<----");
        System.out.println(count(root));// time complexity o(n)

        System.out.println();
        System.out.println("--->>> sum of node  <<<<-----");
        System.out.println(sumOfNode(root));

        System.out.println();
        System.out.println("----->>> Height of node <<<<---- ");
        System.out.println(Height(root));

        System.out.println();
        System.out.println("---->>> Diameter of tree <<<----");
        System.out.println(Diameter(root)); // time complexity o(n^2)

        System.out.println();
        System.out.println("---->>>  Diameter of Tree - Approach2  <<<<<<-----");
        System.out.println(Diameter2(root).diam);// time complexity is o(N)

        System.out.println();
        System.out.println("----->>>>> Subtree of another tree <<<<----");
        System.out.println(root);
    }
}
