import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.chars() // IntStream으로, char을 int로 다루려고
            .distinct()
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());
        return answer;
    }
}