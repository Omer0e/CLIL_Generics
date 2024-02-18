public class StackEmptyException extends Throwable {
    /**
     * @author Omar Omerovic
     * @version 2024-02-18
     * An Exception that occurs when the stack is full
     */
    public StackEmptyException() {
        System.err.println("Stack is empty");
    }
}
