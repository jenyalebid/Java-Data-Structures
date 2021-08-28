package LinkedList;

public class LinkedNode {

    private int data;
    private LinkedNode nextNode;

    public LinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public LinkedNode getNextNode() {
        return this.nextNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(LinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }
}
