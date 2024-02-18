public class Stack<T> {
    private Object[] stack;  // declaring a object generic array
    private int count;  // declaring a counter
    public Stack() {
        stack = new Object[10];  // initializing the array
        this.count = 0;  // initializing the counter
    }
    /**
     * @author Omar Omerovic
     * @version 2024-02-18
     * @param stacked the Object that should be added
     * adds the parameter to the stack.
     */
    public void push(T stacked) throws StackFullException{
        if(stack[stack.length-1] != null) {
            throw new StackFullException();
        }
        else {
            stack[count++] = stacked; // adds the parameter/Objekt to the stack in the next position
        }
    }
    /**
     * @author Omar Omerovic
     * @version 2024-02-18
     * @return the popped Object
     * removes the "top" of the Stack and returns it
     */
    public T pop() throws StackEmptyException {
        if (count == 0) {
            throw new StackEmptyException();
        }
        T element = (T) stack[--count]; // puts the element that is going to be deleted and puts it in a variable, at the same time makes the count go to the last Object
        stack[count] = null; // Clear the index/slot in the stack
        return element;
    }
    public T peek() throws StackEmptyException {
        if (count == 0) {
            throw new StackEmptyException();
        }
        if(stack[count+1] == null) {
            return (T) stack[count - 1]; // returns the top Object in the array
        }
        else {
            return (T) stack[count]; // returns the top Object in the array too
        }
    }
    /**
     * @author Omar Omerovic
     * @version 2024-02-18
     * @return the List
     * Builds a List of the Stack
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(stack[i]); // appends the objects
            if (i < count - 1) {
                sb.append(';'); // only makes a ; when there is a next Object
            }
        }
        return sb.toString();
    }
}
