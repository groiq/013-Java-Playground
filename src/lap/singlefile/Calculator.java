package lap.singlefile;

public class Calculator {

    // private static boolean additive;
    // private static boolean secondStep;

    public static void main(String[] args) {

        int limit = 8;

        // for (int i = 0; i < limit; i++) {
        //     for (int j = 0; j < limit; j++) {
        //         System.out.println(i + " - " + j + " = " + subtract(i, j));
        //     }
        // }        

        // int i = add(1, 3);
        // System.out.println(i);

        divide(9, 3)

        // System.out.println("----------------------------------------------------");

    }

    private static int add(int a, int b) {

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

    private static int multiply(int a, int b) {
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

    private static int subtract(int a, int b) {
        // return subtractBitComplement(a, b);
        return subtractBinary(a, b);
    }

    private static int subtractBitComplement(int a, int b) {
        b = add(~b, 1);
        return add(a, b);
    }

    private static int subtractBinary(int a, int b) {
        // todo implement
        int plainResult = a ^ b;
        int borrow = ( ~a & b ) << 1;

        if (borrow != 0) {
            plainResult = subtractBinary(plainResult, borrow);
        }

        return plainResult;
    }

    private static int divide(int aP, int bP) {

        // duplicate variables in case we need to preserve the originals
        int a = aP;
        int b = bP;

        // align most significant bits. Will break if a <= b originally.
        int bitAlignTracker = -1;
        while (a > b) {
            b = b << 1;
            add(bitAlignTracker, 1);
        }
        b = b >> 1; 

        


        return -1;
    }
    
}
