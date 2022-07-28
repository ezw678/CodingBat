// Return a version of the given array where each zero value in the array is replaced
// by the largest odd value to the right of the zero in the array. If there is no odd
// value to the right of the zero, leave the zero as a zero.

import java.util.Arrays;

public class ZeroMax {

  public static void main(String[] args) {
    int [] arr = {0, 5, 0, 3};

    System.out.println(Arrays.toString(zeroMax(arr)));
    // output: [5, 5, 3, 3]
  }

  public static int[] zeroMax(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 0) {
        int max = 0;
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[j] % 2 != 0 && nums[j] > max) {
            max = nums[j];
          }
        }
        nums[i] = max;

        max = 0;
      }
    }

    return nums;
  }

}
