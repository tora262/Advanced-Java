package baitap;

public class TreeNodeService<E extends Comparable> {
    TreeNode<E> root;

    public TreeNodeService(TreeNode<E> root) {
        this.root = root;
    }

    public void expandLeft(E e) {
        root.setLeft(new TreeNode<>(e));
    }

    public void expandRight(E e) {
        root.setRight(new TreeNode<>(e));
    }

    public boolean search(E element) {
        TreeNode<E> current = root;
        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }

}
