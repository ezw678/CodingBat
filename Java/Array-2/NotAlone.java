// We'll say that an element in an array is "alone" if there are values before and after
// it, and those values are different from it. Return a version of the given array where
// every instance of the given value which is alone is replaced by whichever value to
// its left or right is larger.

import java.util.Arrays;

public class NotAlone {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};

    System.out.println(Arrays.toString(notAlone(arr, 2)));
    // output: [1, 3, 3]
  }

  public static int[] notAlone(int[] nums, int val) {
    int len = nums.length;
    int [] n2 = nums.clone();

    for (int i = 1; i < len - 1; i++) {
      if (nums[i - 1] != nums[i + 1] && nums[i - 1] != nums[i] && nums[i] != nums[i + 1])
        n2[i] = Math.max(nums[i - 1], nums[i + 1]);
    }

    return n2;
  }

}
