
import java.util.EmptyStackException;

public class ArrayBasedStack implements StackADT {
    
    private String[] stack;
    private int rear;
    private int size;
    private int capacity = 10;

    public ArrayBasedStack() {
        stack = new String[capacity];
        rear = -1;
        size = 0;
    }

    public void resize() {
        capacity *= 2;
        String[] tempArray = stack;
        stack = new String[capacity];
        for (int i = 0; i < size; i++) {
            stack[i] = tempArray[i];
        }
        tempArray = null;
    }

    @Override
    public void push(String item) {
        if (isFull()) {
            resize();
        }
        stack[rear + 1] = item;
        rear += 1;
        size += 1;
    }

    @Override
    public String pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            String popValue = stack[rear];
            stack[rear] = null;
            rear -= 1;
            size -= 1;
            return popValue;
        }
    }

    @Override
    public String peek() throws EmptyStackException{
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[rear];
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
