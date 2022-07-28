// Return a version of the given array where all the 10's have been removed. The remaining
// elements should shift left towards the start of the array as needed, and the empty
// spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
// You may modify and return the given array or make a new array.

import java.util.Arrays;

public class WithoutTen {

  public static void main(String[] args) {
    int [] arr = {1, 10, 10, 2};

    System.out.println(Arrays.toString(withoutTen(arr)));
    // output: [1, 2, 0, 0]
  }

  public static int[] withoutTen(int[] nums) {
    int len = nums.length;

    int count = 0;
    boolean flag = false;

    for (int i = 0; i < len; i++) {
      if (nums[i] == 10) {
        flag = true;
        count++;
        continue;
      } else {
        if (flag)
          nums[i - count] = nums[i];
      }
    }

    for (int i = len - 1; i >= len - count; i--) {
      nums[i] = 0;
    }

    return nums;
  }

}
