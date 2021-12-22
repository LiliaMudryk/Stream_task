import tasks.FizzBuzzTask;
import tasks.FlattingTask;
import tasks.GroupWordsTask;
import tasks.MapTask;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("1","abc","3","ab");

        System.out.println(MapTask.mapping(arr));

        System.out.println(FlattingTask.flattingStrings(arr));

        System.out.println(FizzBuzzTask.fizzBuzzIt(10));

        List<String> arr2 = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(GroupWordsTask.groupIt(arr2));

    }
}
