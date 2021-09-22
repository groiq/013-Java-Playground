package lap.singlefile;

public class CalculatorTest {

    private static int errorCount = 0;

    // backlog: manually import junit. For now, I'll improvise an assert method.
    private static void checkForEquality(String method, int expected, int actual) {
        if (expected != actual) {
            errorCount++;
            System.out.println("Error: " + method + " should return " + expected + ", but returns " + actual + "!");
        }
    }

    public static void main(String[] args) {

        int limit = 1024;
        

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                checkForEquality((i + " + " + j), (i + j), Calculator.add(i, j));
                checkForEquality((i + " - " + j), (i - j), Calculator.subtract(i, j));
                checkForEquality((i + " * " + j), (i * j), Calculator.multiply(i, j));
                if (j != 0 && i >= j) {
                    checkForEquality((i + " / " + j), (i / j), Calculator.divide(i, j));   
                }
            }
        }
        System.out.println("Detected " + errorCount + " errors.");
    }
    
}
