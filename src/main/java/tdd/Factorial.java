package tdd;

import java.util.HashMap;
import java.util.Map;

public class Factorial {
    public static int getFactorialNumber(int input) {
        if(input<=2)
        return input;
       return input * getFactorialNumber(input-1);
    }
    static Map<Integer,Integer> factorialMap = new HashMap<>();
    public static int getFactorialNumberWithMap(int input){
        for(int i = 1; i<=input; i++ ) {

            if (i <= 2) {
                factorialMap.put(i, i);
            }else{
                factorialMap.put(i, (i * factorialMap.get(i - 1)));
            }
        }
       return factorialMap.get(input);
    }
}
