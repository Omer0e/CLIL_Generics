class StackFullException extends Throwable {
    /**
     * @author Omar Omerovic
     * @version 2024-02-18
     * An Exception that occurs when the stack is full
     */
    public StackFullException() {
        System.err.println("Stack is full, remove some Objects to add new ones");
    }
}
