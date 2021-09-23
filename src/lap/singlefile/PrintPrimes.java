package lap.singlefile;

import java.util.List;

public class PrintPrimes {

    public static void main(String[] args) {

        printPrimes(100, 10);
    }

    public static void printPrimes(int limit, int lineLength) {
        int[] primes = collectPrimesAsArray(limit);

        System.out.println("printing primes up to " + limit + "...");
        System.out.print("|");

        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + "|");
            if ((i+1) % lineLength == 0) {
                System.out.println();
            }
        }
    }

    public static int[] collectPrimesAsArray(int limit) {

        int resultLength = 0;
        boolean[] asBools = collectPrimesAsBools(limit);

        // todo shortcuts? such as if b; add b to resultLength
        for (boolean b : asBools) {
            if (b == true) {
                resultLength++;
            }
        }

        int[] result = new int[resultLength];

        int resultPos = 0;
        for (int i = 0; i < asBools.length; i++) {
            if (asBools[i] == true) {
                result[resultPos] = i;
                resultPos++;
            }
        }

        return result;
    }

    /**
     * Returns an array of bools up to a limit that signify whether the number is a prime.
     * Indices 0 and 1 will always be false, but I'll keep them around for clarity.
     * @param limit
     * @return
     */
    /*
     * backlog: instead of tracking isPrime property, track the hasFactors property 
     * and get rid of the isPrime variable
     */
    public static boolean[] collectPrimesAsBools(int limit) {

        limit++;

        boolean[] result = new boolean[limit];

        boolean isPrime = false;
        for (int i = 2; i < result.length; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (result[j] == false) {
                    continue;
                }
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                result[i] = true;
            }
        }

        return result;
    }
}
