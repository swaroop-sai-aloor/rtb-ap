
 
import java.util.Stack;
 
public class BinaryTreeInOrder {
 
    public static class Table
    {
        int data;
        Table left;
        Table right;
        Table(int data)
        {
            this.data=data;
        }
    }
 
    // Recursive Solution
    public void inOrder(Table root) {
        if(root !=  null) {
            inOrder(root.left);
            //Visit the node by Printing the node data  
            System.out.printf("%d ",root.data);
            inOrder(root.right);
        }
    }
 
    // Iterative solution
    public void inOrderIter(Table root) {
 
        if(root == null)
            return;
 
        Stack<Table> s = new Stack<Table>();
        Table currentNode=root;
 
        while(!s.empty() || currentNode!=null){
 
            if(currentNode!=null)
            {
                s.push(currentNode);
                currentNode=currentNode.left;
            }
            else
            {
                Table n=s.pop();
                System.out.printf("%d ",n.data);
                currentNode=n.right;
            }
        }
    }
 
    public static void main(String[] args)
    {
        BinaryTreeInOrder bi=new BinaryTreeInOrder();
        // Creating a binary tree
        Table rootNode=createBinaryTree();
        System.out.println("Using Recursive solution the table capapcity order:");
 
        bi.inOrder(rootNode);
 
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Using Iterative solution the table capacity order:");
 
        bi.inOrderIter(rootNode);
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