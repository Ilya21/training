package util;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharCounter {
    public static Map<Character, Long> getCharsAmount(String str){
        return Arrays.stream(str.toLowerCase().split(""))
                .map(s -> s.charAt(0))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

  private CharCounter() {
  }
}
