public class Stack<T> implements StackInterface<T> {

    //member varuables
    private Node<T> top; // access to stack
    private int size;

     
    // O(1)
    public void push(T input){
        // if input is null, throw exception(optional)
    
        // save  top  on temp. variable
        Node<T> prevNode = top;
        // assign top to a new node where the next node is the temp. variable
        top = new Node<T>(input, prevNode);
        // increment size by 1
        size++;
    }
    //O(1)
    // removes and returns item back to user
    public T pop(){ 
        
       // save the item that is on top of the stack
       T itemToReturn = top.getItem();
       // assign top to the next Node
        top = top.getNext();
       // decrement size by 1
       size--;
       // return what was on top of the stack
       return itemToReturn;
    }
    // O(1)
    public T peek(){ 
        // returns item back to user
        if(size > 0) {
            return top.getItem();
        } else {
        return null;
        }
    }
    // O(1)
    public boolean isEmpty(){
        return size == 0; //fix me
    }
    // O(1)
    public int size(){
        return size;
    }
    // O(n)
    public boolean contains(T input){
        //use temp. var & initialize to top
        Node<T> temp = top;
        T tempItem = temp.getItem();
        //use temp. var, loop until next node isnt null
        while(true){
            if((tempItem== input)== true){ //
                return true;
            }
            else if(tempItem== null){
                return false;
            }
            if(temp.getNext() == null){
                break; // makes me type in terminal
            }
            temp = temp.getNext();
        }
        // check if match found false otherwise

        //return true if item found, otherwise false
        return false;
    }
}
