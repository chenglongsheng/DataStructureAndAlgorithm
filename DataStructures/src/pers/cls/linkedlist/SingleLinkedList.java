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

    /**
     * @param studentNode no唯一，改动名字
     */
    public void update(Node<Student> studentNode) {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        Node<Student> point = head;
        while (point.next != null) {
            point = point.next;
            if (studentNode.data.getNo().equals(point.data.getNo())) {
                point.data.setName(studentNode.data.getName());
                break;
            }
        }
    }

    public void insert(Node<Student> studentNode, Node<Student> before) {
        studentNode.next = before.next;
        before.next = studentNode;
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
