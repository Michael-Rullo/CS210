import java.util.EmptyStackException;

public class LinkedListBasedStack implements StackADT{

    private iNode<String> head = null;
    private int size = 0;
    
    @Override
    public void push(String item) {
        iNode<String> newNode = new iNode<>(item);
        if (isEmpty()) {
            head = newNode;
        } else {
            iNode<String> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size += 1;
    }

    @Override
    public String pop() throws EmptyStackException{
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        if (size == 1) {
            String result = head.getData();
            head = null;
            size -= 1;
            return result;
        }

        iNode<String> current = head;
        for (int i = 0; i < size - 2; i++) {
            current = current.getNext();
        }
        String result = current.getNext().getData();
        current.setNext(null);
        size -= 1;
        return result;
    }

    @Override
    public String peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        iNode<String> current = head;
        for (int i = 0; i < size - 1; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
