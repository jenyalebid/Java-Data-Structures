package LinkedList;

public class LinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    public void insertAtHead(int data) {

        var newNode = new LinkedNode(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    public void insertAtTail(int data) {

        var newNode = new LinkedNode(data);

        if (head == null)
            head = newNode;

        if (tail != null)
            tail.setNextNode(newNode);
            tail = newNode;
    }

    public int length() {

        int length = 0;
        LinkedNode current = head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public void deleteFromHead() {
        head = head.getNextNode();
    }

    public LinkedNode find(int data) {

        LinkedNode current = head;

        while (current != null) {

            if (current.getData() == data)
                return current;

            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "{";
        LinkedNode current = head;

        while (current != null) {

            result += current.toString() + ",";
            current = current.getNextNode();
        }

        result += "}";

        return result;
    }
}
