
import java.util.Stack;

public class BinaryTreePreOrder {
 
    public static class Table
    {
        int data;
        Table left;
        Table right;
        Table (int data)
        {
            this.data=data;
        }
    }
 
    // Recursive Solution
    public void preorder(Table root) {
        if(root !=  null) {
            //Visit the node-Printing the node data  
            System.out.printf("%d ",root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
 
    // Iterative solution
    public void preorderIter(Table root) {
 
        if(root == null)
            return;
 
        Stack<Table> stack = new Stack<Table>();
        stack.push(root);
 
        while(!stack.empty()){
 
            Table n = stack.pop();
            System.out.printf("%d ",n.data);
 
            if(n.right != null){
                stack.push(n.right);
            }
            if(n.left != null){
                stack.push(n.left);
            }
 
        }
 
    }
 
    public static void main(String[] args)
    {
        BinaryTreePreOrder bi=new BinaryTreePreOrder();
        // Creating a binary tree
        Table rootNode=createBinaryTree();
        System.out.println("Using Recursive solution, the order of table capacity:");
 
        bi.preorder(rootNode);
 
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Using Iterative solution, the order of table capacity:");
 
        bi.preorderIter(rootNode);
    }
 
    public static Table createBinaryTree()
    {
 
        Table rootNode =new Table(4);
        Table node2=new Table(2);
        Table node1=new Table(1);
        Table node3=new Table(3);
        Table node6=new Table(6);
        Table node5=new Table(5);
        Table node7=new Table(7);
 
        rootNode.left=node2;
        rootNode.right=node6;
 
        node2.left=node1;
        node2.right=node3;
 
        node6.left=node5;
        node6.right=node7;
 
        return rootNode;
    }
}
 