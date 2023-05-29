import java.util.*;

public class LargestAdjacentLCM {
    public static int largestAdjacentLCM(int[] arr) {
        int max_lcm = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int current_lcm = lcm(arr[i], arr[i + 1]);
            max_lcm = Math.max(max_lcm, current_lcm);
        }

        return max_lcm;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return Math.abs(a * b) / gcd;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2};
        int largestElement = largestAdjacentLCM(arr);
        System.out.println("Largest element in set S: " + largestElement);
    }
}
