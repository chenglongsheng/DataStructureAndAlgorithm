package pers.cls.queue;

public class CircleQueue {

    private int front;
    private int rear;
    private final int maxSize;
    private final int[] arr;

    public CircleQueue(int arrMaxSize) {

        front = 0;
        rear = 0;
        maxSize = arrMaxSize;
        arr = new int[arrMaxSize];

    }

    /**
     * 判断环形队列是否为空，队列存储数据为 maxSize-1
     *
     * @return 空为 true
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueueData(int value) {
        if (isFull()) {
            System.out.println("队列已满");
        } else {
            rear = rear % maxSize;
            arr[rear] = value;
            rear++;
            System.out.println(rear);
        }
    }

    public void getQueueFront() {
        if (isEmpty()) {
            System.out.println("队列为空");
        } else {
            front = front % maxSize;
            int value = arr[front];
            System.out.println("取出队头为：" + value);
            front++;
        }
    }

    public void showCircleQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
        } else {
            System.out.print("当前队列为：");
            for (int i = front; i < front + getCount(); i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public int getCount() {
        return (rear + maxSize - front) % maxSize;
    }

    public void showFront() {
        if (isEmpty()) {
            System.out.println("队列为空");
        } else {
            System.out.println("当前队头为：" + arr[front]);
        }
    }

}
