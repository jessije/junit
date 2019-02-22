package one;

public class FactorialV {

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    public static int calculateFactorial(int number) {
        if(number <=0)
            throw new RuntimeException("The number must be greater than 0");
        else if(number>20){
            throw new RuntimeException ("the number is greater than 20, " + "integer overloading happened");
        }
        int result = 1;
        for (int counter = 1; counter < number; counter++) {
            result = result*counter;
        }
        return result;
    }

    }

