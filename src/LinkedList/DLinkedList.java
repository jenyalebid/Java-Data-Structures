package LinkedList;

public class DLinkedList {

    private DLinkedNode head;

    public void insertAtHead(int data) {

        var newNode = new DLinkedNode(data);
        newNode.setNextNode(head);

        if (head != null)
            head.setPrevNode(newNode);

        head = newNode;
    }

    @Override
    public String toString() {
        String result = "{";
        DLinkedNode current = head;

        while (current != null) {

            result += current.toString() + ",";
            current = current.getNextNode();
        }

        result += "}";

        return result;
    }
}
