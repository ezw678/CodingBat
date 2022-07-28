// Return the sum of the numbers in the array, returning 0 for an empty array.
// Except the number 13 is very unlucky, so it does not count and numbers that
// come immediately after a 13 also do not count.

public class Sum13 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 2, 1};

    System.out.println(sum13(arr));
    // output: 6
  }

  public static int sum13(int[] nums) {
    int len = nums.length;
    if (len == 0) return 0;

    int sum = 0;
    for (int i = 0; i < len; i++) {
      if (nums[i] == 13) {
        i++;
        continue;
      }
      sum += nums[i];
    }

    return sum;
  }

}
