package tasks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(int n){
        return IntStream.range(1,n+1)
                .mapToObj(x ->{
                    if (x%5 ==0 && x%3 ==0 ){
                        return "Fizz Buzz";
                    }
                    else if (x%3 ==0){
                        return "Fizz";
                    }
                    else if (x%5 ==0){
                        return "Buzz";
                    }
                    else{
                        return Integer.toString(x);
                    }
                }).collect(Collectors.toList());

    }
}
