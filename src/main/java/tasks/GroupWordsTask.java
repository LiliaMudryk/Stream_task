package tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static HashMap<Character, List<String>> hashMapGroup(List<String> arr){
        return arr
                .stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), HashMap::new, Collectors.toList()));
    }
    public static int count(List<String> lst){
        int counter = 0;
        for (String x: lst){
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == x.charAt(0)) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static Map<Character, Integer> groupIt(List<String> arr){
        HashMap<Character, List<String>> hashMap = hashMapGroup(arr);
        return hashMap.entrySet().stream()
                        .collect(Collectors.toMap(
                                e -> e.getKey(),
                                e -> count(e.getValue())
                        ));
    }
}
