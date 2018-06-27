public class checkBST {

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

    public static boolean checkBST(BinaryTreeNode root, int min, int max) {
        if (root != null) {
            if (root.value > min && root.value < max) {
                return checkBST(root.left, min, root.value) && checkBST(root.right, root.value, max);

            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static boolean isBinarySearchTree(BinaryTreeNode root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}


