import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Integer> evensOnly(List<Integer> ints) {
        return ints.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

}
