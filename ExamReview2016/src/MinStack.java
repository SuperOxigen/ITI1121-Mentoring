import java.lang.Comparable;

public class MinStack<T extends Comparable<T>>
{
    // Instance Variables

    private Stack<T> minimumStack;
    private Stack<T> stack;

    // Instance Methods

    public MinStack() {
        minimumStack = new SimpleLinkedStack<T>();
        stack = new SimpleLinkedStack<T>();
    }

    public T pop() {
        if (isEmpty())
            return null;

        T value = stack.pop();
        if (value.equals(minimumStack.peak()))
            minimumStack.pop();

        return value;
    }

    public T peak() {
        return stack.peak();
    }

    public T min() {
        return minimumStack.peak();
    }

    public void push(T elem) {
        if (isEmpty() || elem.compareTo(min()) <= 0)
            minimumStack.push(elem);
        stack.push(elem);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String args[]) {
        MinStack<Integer> integerStack = new MinStack<>();
        int value;

        System.out.println("Pushing 5");
        integerStack.push(5);
        System.out.println("Pushing 4");
        integerStack.push(4);
        System.out.println("Pushing 8");
        integerStack.push(8);
        System.out.println("Pushing 3");
        integerStack.push(3);
        System.out.println("Pushing 5");
        integerStack.push(5);

        System.out.println("Expecting min of 3");
        value = integerStack.min();
        if (value != 3)
            System.out.println("Fail - " + value);
        else
            System.out.println("Pass");

        System.out.println("Pop");
        integerStack.pop();
        System.out.println("Pop");
        integerStack.pop();

        System.out.println("Expecting min of 4");
        value = integerStack.min();
        if (value != 4)
            System.out.println("Fail - " + value);
        else
            System.out.println("Pass");
    }
}
