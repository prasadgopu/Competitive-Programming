class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode insertLeft(int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    public BinaryTreeNode insertRight(int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }
}


class Height
{
    int height = 0;
}
public class BalancedBinaryTree {
    public boolean isBalanced(BinaryTreeNode root,Height h)
    {
        if(root==null)
        {
            h.height=0;
            return true;
        }
        Height left_height=new Height();
        Height right_height=new Height();

        boolean leftSTree=isBalanced(root.left,left_height);
        boolean rightSTree=isBalanced(root.right,right_height);

        h.height=(left_height.height>right_height.height?left_height.height:right_height.height)+1;

        if((left_height.height-right_height.height>=2)||(right_height.height-left_height.height>=2))
        {
            if((left_height.height!=0)&&(right_height.height!=0))
                return false;
        }


        return leftSTree & rightSTree;

    }
    public static void main(String[] args) {
        Height height = new Height();
        BalancedBinaryTree tree=new BalancedBinaryTree();
        BinaryTreeNode bt = new BinaryTreeNode(50);


        BinaryTreeNode a30 =bt.insertLeft(30);
        BinaryTreeNode a60 = a30.insertRight(40);
        BinaryTreeNode a20 = a30.insertLeft(20);
        BinaryTreeNode a80 = bt.insertRight(80);
        BinaryTreeNode a70 = a80.insertLeft(70);
        BinaryTreeNode a90 = a80.insertRight(90);



        System.out.println(tree.isBalanced(bt,height));
    }
}