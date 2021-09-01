/**
 * Logical operators
 */

public class Example5 {

    public static void main(String[] operator) {
        // ==, != % &&
        int n, d;
        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0) {
            System.out.println("First Result: " + d + " is a factor of " + n);
        }

        d = 0; // now, we set d to zero
        if (d != 0 && (n % d) == 0) {
            System.out.println("Second Result: " + d + " is a factor of " + n);
        }

        if (d != 0 & (n % d) == 0) {
            System.out.println("Third Result: " + d + " is a factor of " + n);
        }
    }
}