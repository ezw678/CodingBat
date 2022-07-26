// Given an array of ints of even length, return a new array length 2
// containing the middle two elements from the original array. The
// original array will be length 2 or more.

import java.util.Arrays;

public class MakeMiddle {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4};
    System.out.println(Arrays.toString(makeMiddle (arr)));
    // output: [2, 3]
  }

  public static int[] makeMiddle(int[] nums) {
    int mid = nums.length / 2;
    int [] arr = {nums[mid - 1], nums[mid]};

    return arr;
  }

}
