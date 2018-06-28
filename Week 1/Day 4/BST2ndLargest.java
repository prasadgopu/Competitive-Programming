
public class BST2ndLargest {

    public static class BinaryTreeNode {

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

    public static void main(String[] args){
        final BinaryTreeNode root = new BinaryTreeNode(50);
        final BinaryTreeNode a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        final int actual = findSecondLargest(root);
    }

    public static class count{
        int count=0;
        int answer=0;
    }

    public static int findSecondLargest(BinaryTreeNode rootNode) {
        if(rootNode.left==null && rootNode.right==null){
            throw new IllegalArgumentException("");
        }
        count c=new count();
        findSecondLargest(rootNode, c);
        return c.answer;
    }

    public static int findSecondLargest(BinaryTreeNode rootNode, count C) {
        if(rootNode==null || C.count>=2){
            return 0;
        }
        findSecondLargest(rootNode.right,C);
        C.count++;
        if(C.count==2){

            C.answer=rootNode.value;
            return 0;
        }
        findSecondLargest(rootNode.left,C);
        return 0;
    }
}

