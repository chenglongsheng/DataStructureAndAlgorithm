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

    public void delete(Node<Student> studentNode) {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        Node<Student> point = head;
        while (point.next != null) {
            if (studentNode.data.getNo().equals(point.next.data.getNo())) {
                point.next = point.next.next;
                break;
            }
            point = point.next;
        }
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

    /**
     * 查找单链表的倒数第k个节点
     */
    public Node<Student> getBottomNode(int bottomIndex) {
        int size = getSize();
        if (bottomIndex > size) {
            System.out.println("越界");
            return null;
        } else {
            Node<Student> point = head;
            int index = 1;
            while (index <= (size - bottomIndex + 1)) {
                point = point.next;
                index++;
            }
            return point;
        }
    }

    public int getSize() {
        Node<Student> point = head;
        int num = 0;
        while (point.next != null) {
            num++;
            point = point.next;
        }
        return num;
    }

}
