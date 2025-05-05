// LinkedBasedList implementation of ListADT
class LinkedBasedList implements ListADT {
    private Node head;
    private int size;

    // Constructor
    public LinkedBasedList() {
        head = null;
        size = 0;
    }

    // Adds an element at a specific index
    @Override
    public boolean add(int index, String s) {
        Node newNode = new Node(s);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node current = head;
            for (int step = 0; step < index - 1; step++) {
                if (current == null) {
                    return false;
                }
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size += 1;
        return true;
    }

    // Removes an element at a specific index
    @Override
    public String remove(int index) {
        if (head == null) {
            return "";
        }
        if (index == 0) {
            String returnString = head.getValue();
            head = head.getNext();
            size--;
            return returnString;
        }
        Node current = head;
        for (int step = 0; step < index - 1; step++) {
            if (current == null) {
                return "";
            }
            current = current.getNext();
        }
        if (current == null || current.getNext() == null) {
            return "";
        }
        Node nodeToRemove = current.getNext();
        String returnString = nodeToRemove.getValue();
        current.setNext(nodeToRemove.getNext());
        size -= 1;
        return returnString;
    }

    @Override
    //Clear the entire list and reset the size
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public String print(String sep) {
        if (head == null) {
            return ""; // Return an empty string if the list is empty
        }

        String result = head.getValue(); // Start with the first element
        Node current = head.getNext();  // Move to the next node

        while (current != null) {
            result += sep + current.getValue(); // Concatenate each element with the separator
            current = current.getNext();
        }
        return result;
    }


    @Override
    public String getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    // Helper method that returns the node at the specified index
    private Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }


}
