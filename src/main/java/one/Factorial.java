package one;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    public static int calculateFactorial(int number) {
        if(number <=0)
            throw new RuntimeException("The number must be greater than 0");
        int result = 1;
        for (int counter = 1; counter < number; counter++) {
            result = result*counter;
        }
        return result;
    }

    }

