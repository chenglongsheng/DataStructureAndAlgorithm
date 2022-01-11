package pers.cls.queue;

public class ArrayQueue {

    private final int maxSize;
    private int head;
    private int tail;
    private final int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        head = -1;
        tail = -1;
        arr = new int[maxSize];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return tail == maxSize - 1;
    }

    public void addQueue(int value) {
        if (isFull()) {
            System.out.println("队列已满");
        } else {
            tail++;
            arr[tail] = value;
        }
    }

    public void getQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
        } else {
            head++;
            System.out.println("获取的值：" + arr[head]);
        }
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
        } else {
            System.out.print("当前队列：");
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }

    public void showHead() {
        if (isEmpty()) {
            System.out.println("队列为空");
        } else {
//            if (head == -1) {
                System.out.println("当前队头：" + arr[head + 1]);
//            } else {
//                System.out.println("当前队头：" + arr[head]);
//            }

        }
    }

}
