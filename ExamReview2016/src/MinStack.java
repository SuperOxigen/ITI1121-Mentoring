import java.lang.Comparable;

public class MinStack<T extends Comparable<T>>
{
    // Instance Variables



    // Instance Methods

    public MinStack() {
        // TODO
    }

    public T pop() {
        // TODO
        return null;
    }

    public T peak() {
        // TODO
        return null;
    }

    public T min() {
        // TODO
        return null;
    }

    public void push(T elem) {
        // TODO
    }

    public boolean isEmpty() {
        // TODO
        return false;
    }

    public int size() {
        // TODO
        return 0;
    }

    public static void main(String args[]) {
        MinStack<Integer> integerStack = new MinStack<>();

        System.out.println("Pushing 5");
        integerStack.push(5);
        System.out.println("Pushing 4");
        integerStack.push(4);
        System.out.println("Pushing 8");
        integerStack.push(8);

    }
}
