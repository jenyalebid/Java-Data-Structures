package LinkedList;

public class Main {

    public static void main(String[] args) {


        var list = new LinkedList();
        var dList = new DLinkedList();

        dList.insertAtHead(5);
        dList.insertAtHead(6);
        dList.insertAtHead(7);
        dList.insertAtHead(8);



        list.insertAtTail(12);
        list.insertAtTail(13);
        list.insertAtHead(1);

        System.out.println(list.length());
        System.out.println(dList);
    }
}
