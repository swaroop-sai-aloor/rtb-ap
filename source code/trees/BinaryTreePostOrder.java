

import java.util.Stack;

public class BinaryTreePostOrder {
 
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
    public void postOrder(Table root) {
        if(root !=  null) {
            postOrder(root.left);
            postOrder(root.right);
            //Visit the node by Printing the node data  
            System.out.printf("%d ",root.data);
        }
    }
 
    // Iterative solution
    public void postorderIter( Table root) {
       
        if( root == null ) return;
 
        Stack<Table> s = new Stack<Table>( );
        Table current = root;
 
        while( true ) {
 
            if( current != null ) {
                if( current.right != null ) 
                    s.push( current.right );
                s.push( current );
                current = current.left;
                continue;
            }
 
            if( s.isEmpty( ) ) 
                return;
            current = s.pop( );
 
            if( current.right != null && ! s.isEmpty( ) && current.right == s.peek( ) ) {
                s.pop( );
                s.push( current );
                current = current.right;
            } else {
                System.out.print( current.data + " " );
                current = null;
            }
        }
    }
 
    public static void main(String[] args)
    {
        BinaryTreePostOrder bi=new BinaryTreePostOrder();
        // Creating a binary tree
        Table rootNode=createBinaryTree();
        System.out.println("Using Recursive solution the table capacity is:");
 
        bi.postOrder(rootNode);
 
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Using Iterative solution the table capacity is:");
 
        bi.postorderIter(rootNode);
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
