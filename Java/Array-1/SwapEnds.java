// Given an array of ints, swap the first and last elements in the
// array. Return the modified array. The array length will be at least 1.

import java.util.Arrays;

public class SwapEnds {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4};
    System.out.println(Arrays.toString(swapEnds(arr)));
    // output: [4, 2, 3, 1]
  }

  public static int[] swapEnds(int[] nums) {
    int len = nums.length;
    if (len == 1) return nums;
    int temp = nums[0];
    nums[0] = nums[len - 1];
    nums[len - 1] = temp;

    return nums;
  }

}
