
public class SimpleLinkedStack<T> implements Stack<T>
{
    private static class Node<NT>
    {
        private NT value;
        private Node<NT> next;
        private Node(NT value, Node<NT> next)
        {
            this.value = value;
            this.next = next;
        }
    }

    private Node<T> top;
    private int size;

    public SimpleLinkedStack()
    {
        top = null;
        size = 0;
    }

    public T pop()
    {
        T value = null;
        if (top != null)
        {
            value = top.value;
            top = top.next;
            size--;
        }
        return value;
    }

    public T peak()
    {
        T value = null;
        if (top != null)
            value = top.value;
        return value;
    }

    public void push(T value)
    {
        if (top == null)
            top = new Node<T>(value, null);
        else
            top = new Node<T>(value, top);
        size++;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int size()
    {
        return size;
    }
}
