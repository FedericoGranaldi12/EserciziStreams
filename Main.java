import java.util.Arrays;

public class Main {

public static int[] arrayStats(int[] nums) {
    int min = Arrays.stream(nums).min().orElse(0);
    int max = Arrays.stream(nums).max().orElse(0);
    int sum = Arrays.stream(nums).sum();
    return new int[]{min, max, sum};
}
// Ho usato degli stream per evitare il ciclo manuale.

}