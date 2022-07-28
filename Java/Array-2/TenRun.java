// For each multiple of 10 in the given array, change all the values following it to be
// that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5}
// yields {2, 10, 10, 10, 20, 20} .

import java.util.Arrays;

public class TenRun {

  public static void main(String[] args) {
    int [] arr = {2, 10, 3, 4, 20, 5};

    System.out.println(Arrays.toString(tenRun(arr)));
    // output: [2, 10, 10, 10, 20, 20]
  }

  public static int[] tenRun(int[] nums) {
    boolean flag = false;
    int mlt = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 10 == 0 && !flag) {
        mlt = nums[i];
        flag = true;
        continue;
      }

      if (flag) {
        if (nums[i] % 10 != 0) {
          nums[i] = mlt;
        } else {
          mlt = nums[i];
        }
      }
    }

    return nums;
  }

}
