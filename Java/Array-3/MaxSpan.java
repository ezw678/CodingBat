// Consider the leftmost and righmost appearances of some value in an array. We'll say that
// the "span" is the number of elements between the two inclusive. A single value has a span
// of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

public class MaxSpan {

  public static void main(String[] args) {
    int [] arr = {1, 4, 2, 1, 4, 1, 4};

    System.out.println(maxSpan(arr));
    // output: 6
  }

  public static int maxSpan(int[] nums) {
    int len = nums.length;
    if (len <= 1) return len;

    int max = 1;
    for (int i = 0; i < len; i++) {
      for (int j = len - 1; j > i; j--) {
        if (nums[i] == nums[j]) {
          int span = j - i + 1;
          if (span > max)
            max = span;

          break;
        }
      }
    }

    return max;
  }

}
