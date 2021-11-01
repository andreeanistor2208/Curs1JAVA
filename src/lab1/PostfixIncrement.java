package lab1;

public class PostfixIncrement {
    public static void main(String[] args) {
        int x = 0;
        while( x ++ < 10) {

        }
        checkForXValue(x);

    }

    private static void checkForXValue(int x) {
        int expectedValue = x;

        System.out.println(" Guessed? - " + (x == expectedValue));
    }
}
