public interface StackInterface<T> {
    
    // O(1)
    public void push(T input);
    //O(1)
    public T pop(); // removes and returns item back to user
    // O(1)
    public T peek(); // returns item
    // O(1)
    public boolean isEmpty();
    // O(1)
    public int size();
    // O(n)
    public boolean contains(T input);
    
}   