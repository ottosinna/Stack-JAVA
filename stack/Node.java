class Node<T> {
    
    // member/instance variables
    // item + link to the next item
    private T item; // data stored
    private Node<T> next; // next item
    
    public Node(T item, Node<T> next) {
        this.item = item;
        this.next = next;
    }
    //getters
    public T getItem() {
        return item;
    }

    public Node<T> getNext() {
        return next;
    }

    //setter
    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
