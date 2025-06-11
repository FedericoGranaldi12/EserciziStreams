import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SetDeduper {
    public static List<String> dedupePreservingOrder(List<String> names) {
        return new ArrayList<>(new LinkedHashSet<>(names));
    }

}
