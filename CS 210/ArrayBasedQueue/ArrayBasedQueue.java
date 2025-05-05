public class ArrayBasedQueue implements QueueADT {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    //Constructor
    public ArrayBasedQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void offer(int element)  {
        if (isFull()){
            throw new IllegalStateException("CANNOT PERFORM OFFER OPERATION-THE QUEUE IS ALREADY FULL");
        } else {
            queue[rear + 1] = element;
            rear += 1;
            size += 1;
        }
    }

    @Override
    public int poll() throws IllegalStateException{
        if (isEmpty()) {
            throw new IllegalStateException("CANNOT PERFORM POLL OPERATION-THE QUEUE IS EMPTY");
        } else {
            int pollValue = queue[0];
            for (int i = 1; i <= rear; i++) {
                int temp = queue [i];
                queue[i - 1] = temp;
            }
            queue[rear] = 0;
            rear -= 1;
            size -= 1;
            return pollValue;
        }
    }


    @Override
    public int peek() {
        return queue[0];
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

}
