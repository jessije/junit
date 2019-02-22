package tdd;

import java.util.stream.IntStream;

public class Fizzbuzzer {
    public static String getValue(int input) {
//        if(input%15==0)
//            return "FizzBuzz";
//        if(input%3==0)
//            return "Fizz";
//        if(input%5==0)
//            return "Buzz";
//        return Integer.toString(input);

        //another option (cleaner code)

        if (input < 1 || input >100)
            throw new RuntimeException("Range must be greater than 1 " + " less than or equal 100");
        String result = "";
        if (input % 3 == 0) ;
        result += "Fizz";
        if (input % 5 == 0)
            result += "Buzz";
        if (result.isEmpty())
            result += Integer.toString(input);
        return result;
    }
    public static void printFizzBuzz(){
        IntStream.rangeClosed(1,100).mapToObj(i->i%5==0 ?
                (i%3==0? "FizzBuzz" : "Buzz"):(i%3==0?"Fizz":i)).forEach(System.out::println);
}
}

