import java.util.EmptyStackException;

public class ArrayBoundedStack {
    private final int[] elements;
    private int topIndex;
    private final int capacity;

    public ArrayBoundedStack(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.topIndex = -1; // -1 means empty
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError("STACK OVERFLOW: Cannot push, stack is full");
        }
        elements[++topIndex] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[topIndex--];
    }

    public boolean isEmpty() { 
        return topIndex == -1; 
    }

    // erases everything from the array
    public void clear() {
        this.topIndex = -1;
    }

    // tracks current element count
    public int size() {
        return topIndex + 1;
    }

        public int getCapacity() {
        // TODO: Return the maximum capacity of the stack
        return 0;
    }
    
    public boolean isFull() { 
        // TODO: Check if the stack has reached its maximum capacity
        return false; 
    }
    
    // erases everything from the array
    public void clear() {
        // TODO: Reset the stack to an empty state
    }

    // tracks current element count
    public int size() {
        // TODO: Return the number of elements currently in the stack
        return 0;
    }

    public int getCapacity() {
        // TODO: Return the maximum capacity of the stack
        return 0;
    }

    // safe way for the GUI to grab copies of the numbers to draw them
    public int[] getRawElements() {
        // TODO: Copy and return only the active elements in the stack
        return new int[0];
    }
}
