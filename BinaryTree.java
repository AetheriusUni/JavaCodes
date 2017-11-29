/* Class containing left and right child of current
   node and key value*/
class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
// A Java program to introduce Binary Tree
class BinaryTree
{
    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }
 
    BinaryTree()
    {
        root = null;
    }
 
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
 
        /*create root*/
        tree.root = new Node(1);
 
        /* following is the tree after above statement
 
              1
            /   \
          null  null     */
 
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
 
        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */
 
 
        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        tree.root.left.left.left = new Node(5);
        preorder(tree.root);
        System.out.println();
        inorder(tree.root);
        System.out.println();
        postorder(tree.root);
    }
    
    // top to bottom 1 2 4 5 3 
    public static void preorder(Node root) {
        if(root !=  null) {
       //Visit the node by Printing the node data  
          System.out.printf("%d ",root.key);
          preorder(root.left);
          preorder(root.right);
        }
      }
    // left to right 5 4 2 1 3 
    public static void inorder(Node root) {
    	  if(root !=  null) {
    	   inorder(root.left);
    	   //Visit the node by Printing the node data  
    	   System.out.printf("%d ",root.key);
    	   inorder(root.right);
    	  }
    	 }
    // bottom to top 5 4 2 3 1 
    public static void postorder(Node root) {
    	  if(root !=  null) {
    	   postorder(root.left);
    	   postorder(root.right);
    	   //Visit the node by Printing the node data  
    	   System.out.printf("%d ",root.key);
    	  }
    	 }
}