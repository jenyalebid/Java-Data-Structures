package BinaryTree;

import com.sun.source.tree.Tree;

public class BinarySearch {

    private TreeNode root;


    public void inset(Integer data) {

        if (root == null)
            root = new TreeNode(data);
        else
            root.inset(data);
    }

    public TreeNode find(Integer data) {

        if (root != null)
            return root.find(data);

        return null;
    }

    public Integer smallest() {

        if (root != null)
            return root.smallest();
        return null;

    }

    public Integer largest() {

        if (root != null)
            return root.largest();
        return null;
    }

    public void delete(Integer data) {

        TreeNode toDelete = find(data);
            toDelete.delete();
    }

//    public void delete(Integer data) {
//
//        TreeNode current = root;
//        TreeNode parent  = root;
//
//        boolean isLeftChild = false;
//
//        if (current == null)
//            return;
//
//        while (current != null && current.getData() != data) {
//
//            parent = current;
//
//            if (data < current.getData()) {
//
//                current = current.getLeftChild();
//                isLeftChild = true;
//            }
//            else {
//                current.getRightChild();
//                isLeftChild = false;
//            }
//        }
//
//        if (current == null)
//            return;
//
//        if (current.getRightChild() == null && current.getRightChild() == null) {
//
//            if (current == root)
//                root = null;
//            else {
//
//                if (isLeftChild)
//                    parent.setLeftChild(null);
//                else
//                    parent.setRightChild(null);
//            }
//        }
//        else if (current.getRightChild() == null) {
//
//            if (current == root)
//                root = current.getLeftChild();
//            else if (isLeftChild)
//                parent.setLeftChild(current.getLeftChild());
//            else
//                parent.setRightChild(current.getLeftChild());
//        }
//        else if (current.getLeftChild() == null) {
//
//            if (current == root)
//                root = current.getRightChild();
//            else if (isLeftChild)
//                parent.setLeftChild(current.getRightChild());
//            else
//                parent.setLeftChild(current.getRightChild());
//        }
//    }
}
