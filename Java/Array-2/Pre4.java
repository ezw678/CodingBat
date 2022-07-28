// Given a non-empty array of ints, return a new array containing the elements from
// the original array that come before the first 4 in the original array. The original
// array will contain at least one 4. Note that it is valid in java to create an array
// of length 0.

import java.util.Arrays;

public class Pre4 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 4, 1};

    System.out.println(Arrays.toString(pre4(arr)));
    // output: [1, 2]
  }

  public static int[] pre4(int[] nums) {
    int len = nums.length;

    int idx = 0;
    for (int i = 0; i < len; i++) {
      if (nums[i] == 4) {
        idx = i;
        break;
      }
    }

    int [] arr = Arrays.copyOfRange(nums, 0, idx);

    return arr;
  }

}
