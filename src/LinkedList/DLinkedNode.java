package LinkedList;

public class DLinkedNode {

    private int data;

    private DLinkedNode nextNode;
    private DLinkedNode prevNode;

    public DLinkedNode(int data) {
        this.data = data;
    }


    public int getData() {
        return data;
    }

    public DLinkedNode getNextNode() {
        return nextNode;
    }

    public DLinkedNode getPrevNode() {
        return prevNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(DLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(DLinkedNode prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }
}
