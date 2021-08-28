package BinaryTree;

import com.sun.source.tree.Tree;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    private boolean isDeleted = false;

    public TreeNode (Integer data) {

        this.data = data;
    }

    public Integer smallest() {

        if (leftChild == null)
            return data;
        return leftChild.smallest();
    }

    public Integer largest() {

        if (rightChild == null)
            return data;
        return rightChild.largest();
    }

    public TreeNode find(Integer data) {

        if (this.data == data && !isDeleted)
            return this;

        if (data < this.data && leftChild != null)
            return leftChild.find(data);

        if (rightChild != null)
            return rightChild.find(data);

        return null;
    }

    public void inset(Integer data) {

        if (data >= this.data) {
            if (this.rightChild == null)
                this.rightChild = new TreeNode(data);
            else
            this.rightChild.inset(data);

        }
        else {

            if (this.leftChild == null)
                this.leftChild = new TreeNode(data);
            else
                this.leftChild.inset(data);
        }
    }

    public void delete() {
        isDeleted = true;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
