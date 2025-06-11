import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CopyAndMutate {

    public static List<String> asUppercase(List<String> words) {
        return words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
