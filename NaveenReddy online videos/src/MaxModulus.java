import java.util.Arrays;

public class MaxModulus {
    public static int maxModulo(int[] A) {
        Arrays.sort(A);
        return A[A.length - 2] % A[A.length - 1];
    }
}