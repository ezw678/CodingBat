// Given an array length 1 or more of ints, return the difference between the
// largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
// and Math.max(v1, v2) methods return the smaller or larger of two values.

import java.util.Arrays;

public class BigDiff {

  public static void main(String[] args) {
    int [] arr = {10, 3, 5, 6};

    System.out.println(bigDiff  (arr));
    // output: 7
  }

  public static int bigDiff(int[] nums) {
    Arrays.sort(nums);

    return nums[nums.length - 1] - nums[0];
  }

}
