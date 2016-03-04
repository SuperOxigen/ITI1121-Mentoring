
public class BadFibSequenceException extends IllegalArgumentException {

    private int badInt;

    public BadFibSequenceException(int i) {
        super("Bad Fib Sequency number " + i);
        badInt = i;
    }

    public int getBadInt() {
        return badInt;
    }
    
}
