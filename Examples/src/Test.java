import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;



public class Test {

    public static void ioExcetpionExample() {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("data.txt"));
            file.write("Hello");
            file.close();

        } catch (IOException ioe) {  // Better practice!  Order matters!
            System.out.println("Failed to open, write, or close file.");
            System.exit(1);

        } catch (Exception e) { // Exception equivalent to an else statment
            System.out.println("Something else happend.");
        }
    }

    public static int fib(int num) {
        if (num == 0)                   return 0;
        else if (num == 1 || num == 2)  return 1;
        else if (num > 2)               return fib(num-1) + fib(num-2);
        else throw new BadFibSequenceException(num);
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, -3, 4, 5, -4, 7, 8, 9, -1};
        for (int i = 0; i <= nums.length; i++) {
            try {
                System.out.println("fib(" + nums[i] + ") = " + fib(nums[i]));
            } catch (BadFibSequenceException bfse) {
                System.out.println("Bad input: " + bfse.getBadInt());
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("On index: " + i);
            }
        }
    }
}
