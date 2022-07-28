// Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
// You may modify and return the given array, or return a new array.

import java.util.Arrays;

public class ShiftLeft {

  public static void main(String[] args) {
    int [] arr = {6, 2, 5, 3};

    System.out.println(Arrays.toString(shiftLeft(arr)));
    // output: [2, 5, 3, 6]
  }

  public static int[] shiftLeft(int[] nums) {
    int len = nums.length;
    if (len == 0) return new int [0];

    int [] arr = new int [len];

    for (int i = 1; i < len; i++) {
      arr[i - 1] = nums[i];
    }

    arr[len - 1] = nums[0];

    return arr;
  }

}
