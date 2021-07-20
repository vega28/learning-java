import java.util.Random;

public class SimpleCalculator {

    // instance fields
    int num1;
    int num2;

    // constructor method
    public SimpleCalculator(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    // addition method
    public int addNums(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // subtraction method
    public int subtractNums(int num1, int num2) {
        int diff = num1 - num2;
        return diff;
    }

    // multiplication method
    public int multiplyNums(int num1, int num2) {
        int prod = num1 * num2;
        return prod;
    }

    // division method
    public int divideNums(int num1, int num2) {
        int quo = num1 / num2;
        return quo;
    }

    // modulus method
    public int modNums(int num1, int num2) {
        int mod = num1 % num2;
        return mod;
    }

    public static void main(String[] args) {
        System.out.print("let's calculate some stuff with... ");

        Random randGen = new Random();
        int n1 = randGen.nextInt(25) + 1;
        int n2 = randGen.nextInt(25) + 1;

        // create new instance
        SimpleCalculator calc = new SimpleCalculator(n1, n2);

        System.out.println(calc.num1 + " and " + calc.num2);
        System.out.println("sum: " + calc.addNums(calc.num1, calc.num2));
        System.out.println("difference: " + calc.subtractNums(calc.num1, calc.num2));
        System.out.println("product: " + calc.multiplyNums(calc.num1, calc.num2));
        System.out.println("whole quotient: " + calc.divideNums(calc.num1, calc.num2));
        System.out.println("remainder: " + calc.modNums(calc.num1, calc.num2));

        /* TODO:
        x addition
        x subtraction
        x multiplication
        x division
        x modulo
        - user input
        */
    }
}