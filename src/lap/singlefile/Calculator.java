package lap.singlefile;

public class Calculator {

    // private static boolean additive;
    // private static boolean secondStep;

    public static void main(String[] args) {

        int limit = 8;

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                System.out.println(i + " + " + j + " = " + add(i, j));
            }
        }        

        // int i = add(1, 3);
        // System.out.println(i);

        System.out.println("----------------------------------------------------");

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
        int result = -1;

        

        return result;

    }
    
}
