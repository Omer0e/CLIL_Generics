public class Main {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        try {
            Stack<Integer> intStack = new Stack();
            intStack.push(1);
            intStack.push(2);
            System.out.println(intStack.list());
            System.out.println(intStack.peek());
            intStack.pop();
            System.out.println(intStack.peek());
            intStack.pop();
            intStack.pop(); // pops one time to often to check if the stack empty exception works
        } catch (StackFullException | StackEmptyException e) {
            e.getMessage();
        }
        try {
            Stack<String> strStack = new Stack();
            strStack.push("Hello");
            strStack.push("World");
            System.out.println(strStack.list());
            System.out.println(strStack.peek());
            strStack.pop();
            System.out.println(strStack.peek());
            strStack.pop();
            for(int i = 0 ; i <= 10 ; i++) {
                strStack.push(String.valueOf(i)); // makes the stack full and then trys to add one more to check if the stack full exception works
            }
        } catch (StackFullException | StackEmptyException e) {
            e.getMessage();
        }
    }
}