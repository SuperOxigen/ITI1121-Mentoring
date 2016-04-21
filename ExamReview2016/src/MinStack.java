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
        value = integerStack.pop();
        if (value != 3)
            System.out.println("Fail - " + value);
        else
            System.out.println("Pass");

        System.out.println("Pop");
        integerStack.pop();
        System.out.println("Pop");
        integerStack.pop();

        System.out.println("Expecting min of 4");
        value = integerStack.pop();
        if (value != 4)
            System.out.println("Fail - " + value);
        else
            System.out.println("Pass");
    }
}
