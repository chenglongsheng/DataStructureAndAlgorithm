package pers.cls.linkedlist;

public class SingleLinkedListDemo {

    public static void main(String[] args) {
        Student student1 = new Student(1, "张三");
        Student student2 = new Student(2, "李四");
        Student student3 = new Student(3, "王五");
        Student student4 = new Student(4, "余六");

        Node<Student> node3 = new Node<>(student3);
        Node<Student> node2 = new Node<>(student2);
        Node<Student> node1 = new Node<>(student1);
        Node<Student> node4 = new Node<>(student4);

        SingleLinkedList list = new SingleLinkedList();
        list.add(node1);

        list.add(node3);
        list.add(node2);
//        list.insert(node1);
        list.insert(node4,node1);
        list.update(new Node<>(new Student(4, "张三的儿子")));

        list.delete(new Node<>(new Student(1, "张三的儿子")));

        System.out.println("list.getBottomNode(1) = " + list.getBottomNode(1));

        list.show();
    }

}
