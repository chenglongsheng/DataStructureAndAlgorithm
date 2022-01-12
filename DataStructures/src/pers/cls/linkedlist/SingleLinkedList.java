package pers.cls.linkedlist;


public class SingleLinkedList {

    private final Node<Student> head = new Node<>(null);

    public void add(Node<Student> studentNode) {
        Node<Student> point = head;
        while (point.next != null) {
            point = point.next;
        }
        point.next = studentNode;
    }

    public void show() {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        Node<Student> point = head;
        while (point.next != null) {
            System.out.println(point.next.data);
            point = point.next;
        }
    }

}
