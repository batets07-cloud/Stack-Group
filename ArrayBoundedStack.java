import java.util.EmptyStackException;

public class ArrayBoundedStack {
    private final int[] elements;
    private int topIndex;
    private final int capacity;

    // Constructor for the 10-element limit
    public ArrayBoundedStack(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.topIndex = -1; // -1 means the array is completely empty
    }

    // adds an item to the top
    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError("STACK OVERFLOW: Cannot push, stack is full");
        }
        elements[++topIndex] = value;
    }

    // removes and returns the top item
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[topIndex--];
    }

    // glances at the top item without deleting it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[topIndex];
    }

    // checks if the stack is empty
    public boolean isEmpty() {
        return topIndex == -1;
    }

    // checks if the 10 element limit is hit
    public boolean isFull() {
        return topIndex == capacity - 1;
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
        return capacity;
    }

    // safe way for the GUI to grab copies of the numbers to draw them
    public int[] getRawElements() {
        int[] activeElements = new int[size()];
        System.arraycopy(elements, 0, activeElements, 0, size());
        return activeElements;
    }
}
