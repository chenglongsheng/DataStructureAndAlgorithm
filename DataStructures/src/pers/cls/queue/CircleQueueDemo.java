package pers.cls.queue;

import java.util.Scanner;

public class CircleQueueDemo {
    public static void main(String[] args) {
        CircleQueue queue = new CircleQueue(4);
        char key;
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.println("s（show）：显示队列");
            System.out.println("e（exit）：退出程序");
            System.out.println("a（add）：添加数据到队列");
            System.out.println("g（get）：从队列获取数据");
            System.out.println("h（head）：显示队头数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    queue.showCircleQueue();
                    break;
                case 'e':
                    loop = false;
                    break;
                case 'a':
                    System.out.print("请输入要添加的号码数：");
                    int value = scanner.nextInt();
                    queue.addQueueData(value);
                    break;
                case 'g':
                    queue.getQueueFront();
                    break;
                case 'h':
                    queue.showFront();
                    break;
            }
        }
    }
}
