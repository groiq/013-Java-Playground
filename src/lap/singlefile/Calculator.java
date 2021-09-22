package lap.singlefile;

/**
 * Basic calculation of positive integers using bitwise operations.
 */
public class Calculator {

    // private static boolean additive;
    // private static boolean secondStep;

    public static void main(String[] args) {

        int limit = 8;

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                if (j > i) continue;
                System.out.println(i + " / " + j + " = " + divide(i, j));
            }
        }        

        // int i = add(1, 3);
        // System.out.println(i);

        // divide(9, 3);
        //divide(8,1);
        // divide(2,1);

        // System.out.println("----------------------------------------------------");

    }

    static int[][] divisionResults(int limit) {
        int[][] result = new int[limit][limit];

        return result;
    }

    static int add(int a, int b) {

        // int result = -1;

        int interimResult = a ^ b;
        // System.out.println(interimResult);
        int carryOver = a & b;
        if (carryOver > 0) {
            carryOver = carryOver << 1;
            interimResult = add(interimResult, carryOver);
        }
        // carryOver = carryOver << 1;
        
        // int result = interimResult ^ carryOver;


        return interimResult;


    }

    static int multiply(int a, int b) {
        int result = 0;

        while (b != 0) {
            if ((b & 1) == 1) {
                result = add(result, a);
            }
            b = b >> 1;
            a = a << 1;
        }

        return result;

    }

    static int subtract(int a, int b) {
        // return subtractBitComplement(a, b);
        return subtractBinary(a, b);
    }

    static int subtractBitComplement(int a, int b) {
        b = add(~b, 1);
        return add(a, b);
    }

    static int subtractBinary(int a, int b) {
        int plainResult = a ^ b;
        int borrow = ( ~a & b ) << 1;

        if (borrow != 0) {
            plainResult = subtractBinary(plainResult, borrow);
        }

        return plainResult;
    }

    static int divide(int aP, int bP) {

        if (bP == 0) {
            System.out.println("error: division by zero");
            return -1;
        }
        if (aP == 0) {
            return 0;
        }

        // duplicate variables in case we need to preserve the originals
        int a = aP;
        int b = bP;

        // align most significant bits. Will break if a <= b originally.
        int bitAlignTracker = 0;
        while (a >= b) {
            b = b << 1;
            bitAlignTracker = add(bitAlignTracker, 1);
        }
        b = b >> 1; 

        int result = 0;

        while (bitAlignTracker > 0) {
            result = result << 1;

            if (a >= b) {
                result = result | 1;
                a = subtract(a, b);
            }
            b = b >> 1;
            
            // System.out.println(bitAlignTracker);
            bitAlignTracker = subtract(bitAlignTracker, 1);
        }

        


        return result;
    }
    
}
