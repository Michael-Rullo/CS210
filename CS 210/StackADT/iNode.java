public class iNode<type> {

    private type data;
    private iNode<type> next;
    
    public iNode(type data) {
        this.data = data;
        this.next = null;
    }

    public void setData(type data) {
        this.data = data;
    }

    public type getData() {
        return this.data;
    }

    public void setNext(iNode<type> nextNode) {
        this.next = nextNode;
    }

    public iNode<type> getNext() {
        return this.next;
    }
}
