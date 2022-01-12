package pers.cls.linkedlist;

public class SingleLinkedListDemo {

    public static void main(String[] args) {
        Student student1 = new Student(1, "张三");
        Student student2 = new Student(2, "李四");
        Student student3 = new Student(3, "王五");

        Node<Student> node3 = new Node<>(student3);
        Node<Student> node2 = new Node<>(student2);
        Node<Student> node1 = new Node<>(student1);

        SingleLinkedList list = new SingleLinkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);

        list.show();
    }

}
