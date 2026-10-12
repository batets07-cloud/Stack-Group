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
    
    public boolean isFull() { 
        return topIndex == capacity - 1; 
    }
}
