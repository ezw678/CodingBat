// Given a non-empty array of ints, return a new array containing the elements from the
// original array that come after the last 4 in the original array. The original array
// will contain at least one 4. Note that it is valid in java to create an array of length 0.

import java.util.Arrays;

public class Post4 {

  public static void main(String[] args) {
    int [] arr = {2, 4, 1, 2};

    System.out.println(Arrays.toString(post4(arr)));
    // output: [1, 2]
  }

  public static int[] post4(int[] nums) {
    int len = nums.length;

    int idx = 0;
    for (int i = len - 1; i >= 0; i--) {
      if (nums[i] == 4) {
        idx = i;
        break;
      }
    }

    int [] arr = Arrays.copyOfRange(nums, idx + 1, len);

    return arr;
  }

}
