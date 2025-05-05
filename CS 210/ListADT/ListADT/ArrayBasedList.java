// ArrayBasedList implementation of ListADT
public class ArrayBasedList implements ListADT {

    private String[] list;
    // The number of elements currently on the list
    private int size;
    // Initial capacity of the array
    private static final int INITIAL_CAPACITY = 10;

    public ArrayBasedList() {
        list = new String[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean add(int index, String s) {
        String temp;
        if (size < list.length) {
            size += 1;
            for (int step = index; step < size; step++) {
                temp = list[step];
                list[step] = s;
                if (temp == null) {
                    break;
                } else if (temp.equals("")) {
                    
                }else {
                    s = temp;
                }
            }
        }
        return true;
    }

    @Override
    public String remove(int index) {
        String returnString = "";
        if (size > 0) {
            returnString = list[index];
            list[index] = "";
            size -= 1;
            for (int step = index; step < size; step++) {
                list[step] = list[step + 1];
                list[step + 1] = "";
            }
        }
        return returnString;
    }

    @Override
    public void clear() {
        for (int step = 0; step < size; step++) {
            list[step] = "";
        }
        size = 0;

    }

    @Override
    public String print(String sep) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += list[i];
            if (i < size - 1) {
                result += sep;
            }
        }
        return result;
    }


    @Override
    public String getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
        return list[index];
    }

    // a Helper method that resizes the array to a new capacity
    private void resize(int newCapacity) {
        String[] newList = new String[newCapacity];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

}
