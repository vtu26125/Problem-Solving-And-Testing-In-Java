import java.util.*;
class MaxSubarrayVariants {
    public static void maxSubarray(int[] arr) {
        int maxEnding = arr[0], maxSoFar = arr[0];
        int nonContiguous = Math.max(arr[0], 0);
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
            if (arr[i] > 0) nonContiguous += arr[i];
        }
        if (nonContiguous == 0)
            nonContiguous = Arrays.stream(arr).max().getAsInt();
        System.out.println(maxSoFar + " " + nonContiguous);
    }
}